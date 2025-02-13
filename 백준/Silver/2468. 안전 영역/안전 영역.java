import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static int[][] originMap;
	static boolean[][] visited;
	static int N;

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		
		originMap = new int[N][N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				originMap[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, originMap[i][j]);
			}
		}

		int maxCount = 1;
		for(int level=0; level<=max; level++) {
			map = new int[N][N];
			visited = new boolean[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(originMap[i][j] <= level) {
						map[i][j] = 1;
					}
				}
			}
			
			int count = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(!visited[i][j] && map[i][j] == 0) {
						DFS(i, j);
						count++;
					}
				}
			}
			maxCount = Math.max(maxCount, count);
		}
		System.out.println(maxCount);
	}
	
	private static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] == 0) {
				DFS(nx, ny);
			}
		}
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < N && y < N);
	}
}
