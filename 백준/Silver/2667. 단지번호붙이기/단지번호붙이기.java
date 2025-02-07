import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static boolean[][] visited;
	static int[][] map;
	static List<Integer> homeCountArr;
	static int N;
	static int homeCount;
	
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visited = new boolean[N][N];
		homeCountArr = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		int complexCount = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j] && map[i][j] == 1) {
					homeCount = 0;
					DFS(i, j);
					homeCountArr.add(homeCount);
					complexCount++;
				}
			}
		}
		
		Collections.sort(homeCountArr);
		System.out.println(complexCount);
		for(int i=0; i<homeCountArr.size(); i++) {
			System.out.println(homeCountArr.get(i));
		}
	}
	
	private static void DFS(int x, int y) {
		visited[x][y] = true;
		homeCount++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < N && y < N);
	}
}
