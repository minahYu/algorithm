import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] visited;
	static int[][] map;
	static int w, h;
	static int[] dx = { 0, 0, -1, 1, -1, -1, 1, 1 };
	static int[] dy = { 1, -1, 0, 0, -1, 1, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		
		while(!(str = br.readLine()).equals("0 0")) {
			StringTokenizer st = new StringTokenizer(str);
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			int count = 0;
			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] == 1 && !visited[i][j]) {
						DFS(i, j);
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < h && y < w);
	}
}
