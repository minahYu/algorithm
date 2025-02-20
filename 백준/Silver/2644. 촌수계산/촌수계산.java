import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int result = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int person1 = Integer.parseInt(st.nextToken());
		int person2 = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<n+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[x].add(y);
			list[y].add(x);
		}
		
		DFS(person1, person2, 0);
		
		System.out.println(result);
	}
	
	private static void DFS(int current, int target, int depth) {
		if(current == target) {
			result = depth;
			return;
		}
		
		visited[current] = true;
		
		for(int next : list[current]) {
			if(!visited[next]) {
				DFS(next, target, depth+1);
			}
		}
	}
}
