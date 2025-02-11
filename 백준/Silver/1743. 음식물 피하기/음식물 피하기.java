import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int[][] corridor;
	static boolean[][] visited;
	static int N, M;
	static int count;
	
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] arags) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		corridor = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			
			int y = Integer.parseInt(st.nextToken()) - 1;
			int x = Integer.parseInt(st.nextToken()) - 1;
			
			corridor[y][x] = 1;
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(!visited[i][j] && corridor[i][j] == 1) {
					count = 0;
					DFS(j, i);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}
	
	private static void DFS(int x, int y) {
		visited[y][x] = true;
		count++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(nx, ny) && !visited[ny][nx] && corridor[ny][nx] == 1) {
				DFS(nx, ny);
			}
		}
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < M && y < N);
	}
}
