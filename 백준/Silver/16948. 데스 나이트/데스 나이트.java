import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	private static int[] dr = {-2, -2, 0, 0, 2, 2};
	private static int[] dc = {-1, 1, -2, 2, -1, 1};
	private static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		System.out.println(bfs(r1, c1, r2, c2));
	}
	
	private static int bfs(int r1, int c1, int r2, int c2) {
		int[][] dist = new int[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(dist[i], -1);
		}
		
		Deque<int[]> q = new ArrayDeque<>();
		dist[r1][c1] = 0;
		q.add(new int[] {r1, c1});
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0], c = cur[1];
			if(r == r2 && c == c2) {
				break;
			}
			
			for(int i=0; i<6; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < N && dist[nr][nc] == -1) {
					dist[nr][nc] = dist[r][c] + 1;
					q.add(new int[] {nr, nc});
				}
			}
		}
		
		return dist[r2][c2];
	}
}
