import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static int[][] box;
	static int M, N;
	static Queue<int[]> queue = new LinkedList<>();
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		box = new int[N][M];
		
		int unripe = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				
				if(box[i][j] == 1) {
					queue.add(new int[] {i, j});
				} else if(box[i][j] == 0) {
					unripe++;
				}
			}
		}
		
		if(unripe == 0) {
			System.out.println(0);
			return;
		}

		int result = BFS();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(result);
	}
	
	private static int BFS() {
		int days = -1;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			days++;
			
			for(int i=0; i<size; i++) {
				int[] now = queue.poll();
				int x = now[1];
				int y = now[0];
				
				for(int j=0; j<4; j++) {
					int nx = x + dx[j];
					int ny = y + dy[j];
					
					if(isValid(nx, ny) && box[ny][nx] == 0) {
						box[ny][nx] = 1;
						queue.add(new int[] {ny, nx});
					}
				}
			}
		}
			
		return days;
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0  && y >= 0 && x < M && y < N);
	}
}
