import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static boolean[][] visited;
	static int l;
    
	static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testcaseCount = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testcaseCount; i++) {
			l = Integer.parseInt(br.readLine());
			visited = new boolean[l][l];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int currentX = Integer.parseInt(st.nextToken());
			int currentY = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int goalX = Integer.parseInt(st.nextToken());
			int goalY = Integer.parseInt(st.nextToken());
			
			sb.append(BFS(currentX, currentY, goalX, goalY)).append("\n");
		}
		System.out.println(sb);
	}
	
	private static int BFS(int currentX, int currentY, int goalX, int goalY) {
		if(currentX == goalX && currentY == goalY) return 0;

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {currentX, currentY, 0});
		visited[currentX][currentY] = true;
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			int depth = now[2];
			
			for(int i=0; i<8; i++) {
				int x = now[0] + dx[i];
				int y = now[1] + dy[i];
				
				if(isValid(x, y) && !visited[x][y]) {
					if(x == goalX && y == goalY) return depth+1;
					visited[x][y] = true;
					queue.add(new int[] {x, y, depth+1});
				}
			}
		}
		
		return -1;
	}
	
	private static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < l && y < l);
	}
}
