import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	private static int[] dx = { 0, 0, 1, -1 };
	private static int[] dy = { 1, -1, 0, 0 };
	
	private static int[][] map;
	private static int[][] simulatedMap;
	private static boolean[][] visited;
	
	private static int N, M;
	private static int max = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		simulatedMap = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0);
		
		System.out.println(max);
	}
	
	private static void dfs(int depth) {
		if(depth == 3) {
			bfs();
			count();
			return;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(depth+1);
					map[i][j] = 0;
				}
			}
		}
	}
	
	private static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				simulatedMap[i][j] = map[i][j];
				visited[i][j] = false;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(simulatedMap[i][j] == 2) {
					queue.offer(new int[] {i, j});
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] virus = queue.poll();
			for(int i=0; i<4; i++) {
				int nx = virus[0] + dx[i];
				int ny = virus[1] + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if(!visited[nx][ny] && simulatedMap[nx][ny] == 0) {
						visited[nx][ny] = true;
						simulatedMap[nx][ny] = 2;
						queue.offer(new int[] {nx, ny});
					}
				}
			}
		}
	}
	
	private static void count() {
		int count = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(simulatedMap[i][j] == 0) {
					count++;
				}
			}
		}
		max = Math.max(max, count);
	}
}
