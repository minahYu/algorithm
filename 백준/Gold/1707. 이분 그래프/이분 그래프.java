import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static ArrayList<Integer>[] A;
	static int[] check;
	static boolean[] visited;
	static boolean isEven;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		for(int t=0; t<testcase; t++) {
			String[] s = br.readLine().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			
			A = new ArrayList[V+1];
			visited = new boolean[V+1];
			check = new int[V+1];
			isEven = true;
			
			for(int i=1; i<=V; i++) {
				A[i] = new ArrayList<Integer>();
			}
			
			for(int i=0; i<E; i++) {
				s = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				A[start].add(end);
				A[end].add(start);
			}
			
			for(int i=1; i<=V; i++) {
				if (!isEven) break;
				if (!visited[i]) {
					check[i] = 0;
					DFS(i);
				}
			}
			
			if(isEven) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	private static void DFS(int start) {
		visited[start] = true;
		
		for(int i : A[start]) {
			if(!visited[i]) {
				check[i] = (check[start] + 1) % 2;
				DFS(i);
			} else {
				if(check[start] == check[i]) {
					isEven = false;
					return;
				}
			}
		}
	}
}