import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer>[] tree;
	static boolean[] visited;
	static int[] parentArray;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		tree = new ArrayList[N+1];
		visited = new boolean[N+1];
		parentArray = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i=1; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			tree[a].add(b);
			tree[b].add(a);
		}
		
		DFS(1, 0);
		
		for(int i=2; i<=N; i++) {
			System.out.println(parentArray[i]);
		}
	}
	
	private static void DFS(int current, int parent) {
		visited[current] = true;
		parentArray[current] = parent;
		
		for(int next : tree[current]) {
			if(!visited[next]) {
				parent = current;
				DFS(next, parent);
			}
		}
	}
}
