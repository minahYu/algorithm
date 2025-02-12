import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	static int[][] map;
	static boolean[][] visited;
	static int M, N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			visited = new boolean[N][M];
			
			int K = Integer.parseInt(st.nextToken());
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				map[y][x] = 1;
			}

			int count = 0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(!visited[j][k] && map[j][k] == 1) {
						DFS(j, k);
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static void DFS(int y, int x) {
		visited[y][x] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(nx, ny) && !visited[ny][nx] && map[ny][nx] == 1) {
				DFS(ny, nx);
			}
		}
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < M && y < N);
	}
}
