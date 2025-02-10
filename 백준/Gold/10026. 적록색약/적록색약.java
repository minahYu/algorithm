import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static char[][] graph;
	static boolean[][] visited;
	static int N;
	static int count;
	
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		N = Integer.parseInt(br.readLine());
		graph = new char[N][N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				graph[i][j] = str.charAt(j);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int caseNum=0; caseNum<2; caseNum++) {
			count = 0;
			visited = new boolean[N][N];
			
			if(caseNum == 1) {
				ifColorBlindness();
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(!visited[i][j]) {
						DFS(i, j, graph[i][j]);
						count++;
					}
				}
			}
			sb.append(count).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

	private static void ifColorBlindness() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(graph[i][j] == 'G') {
					graph[i][j] = 'R';
				}
			}
		}
	}
	
	private static void DFS(int x, int y, char color) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(nx, ny) && !visited[nx][ny] && graph[nx][ny] == color) {
				DFS(nx, ny, color);
			}
		}
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < N && y < N);
	}
}
