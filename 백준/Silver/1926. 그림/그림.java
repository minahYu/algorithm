import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int[][] graph;
	static boolean[][] visited;
	static List<Integer> painting;
	
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static int range;
	static int m, n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		visited = new boolean[n][m];
		painting = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!visited[i][j] && graph[i][j] == 1) {
					range = 0;
					dfs(i, j);
					painting.add(range);
				}
			}
		}
		
		if(painting.isEmpty()) {
			System.out.println(0 + " " + 0);
		} else {
			System.out.println(painting.size() + " " + Collections.max(painting));
		}
	}
	
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		range++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < n && ny < m) { 
				if(!visited[nx][ny] && graph[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}	
	}
}
