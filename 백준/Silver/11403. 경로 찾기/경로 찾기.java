import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
	static boolean[] visited;
	static int[][] graph;
	static int[][] invited;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		invited = new int[N][N];
		graph = new int[N][N];
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
				
			for(int j=0; j<N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			visited = new boolean[N];
			DFS(i, i);
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(invited[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void DFS(int start, int current) {
		for(int next=0; next<N; next++) {
			if(graph[current][next] == 1 && !visited[next]) {
				visited[next] = true;
				invited[start][next] = 1;
				DFS(start, next);
			}
		}
	}
}
