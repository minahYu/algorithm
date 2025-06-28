import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static int N, M;
	
	static int[][] graph;
	static int[][] dist;
	static boolean[][] visited;
	
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		graph = new int[N][M];
		dist = new int[N][M];
		visited = new boolean[N][M];
		
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				graph[i][j] = sc.nextInt();
				
				if(graph[i][j] == 1) {
					queue.offer(new int[] {i, j});
					visited[i][j] = true;
				}
			}
		}
		
		bfs(queue);
		
		int maxDist = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				maxDist = Math.max(maxDist, dist[i][j]);
			}
		}
		
		System.out.println(maxDist);
	}
	
	private static void bfs(Queue<int[]> queue) {		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			
			for(int i=0; i<8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny]) {
					visited[nx][ny] = true;
					dist[nx][ny] = dist[x][y] + 1;
					queue.offer(new int[] {nx, ny});
				}
			}
		}
	}
}
