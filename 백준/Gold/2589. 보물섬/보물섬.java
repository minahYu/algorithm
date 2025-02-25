import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static String[][] map;
	static int length, width;
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0 , 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		length = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());
		
		map = new String[length][width];
		
		for(int i=0; i<length; i++) {
			String str = br.readLine();
			for(int j=0; j<width; j++) {
				map[i][j] = str.substring(j, j+1);
			}
		}
		
		int maxDistance = 0;
        for (int i=0; i<length; i++) {
            for (int j=0; j<width; j++) {
                if (map[i][j].equals("L")) {
                    maxDistance = Math.max(maxDistance, BFS(i, j));
                }
            }
        }
        
        System.out.println(maxDistance);
	}
	
	private static int BFS(int x, int y) {
		int maxDepth = 0;

		boolean[][] visited = new boolean[length][width];
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x, y, 0});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int depth = now[2];
			
			maxDepth = Math.max(maxDepth, depth);
			
			for(int i=0; i<4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if(isValid(nx, ny) && !visited[nx][ny] && map[nx][ny].equals("L")) {
					visited[nx][ny] = true;
					queue.add(new int[] {nx, ny, depth+1});
				}
			}
		}
		
		return maxDepth;
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < length && y < width);
	}
}
