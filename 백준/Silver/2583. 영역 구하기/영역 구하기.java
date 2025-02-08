import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int M, N;
	static int[][] graph;
	static boolean[][] visited;
	static List<Integer> areaList;
	static int area;
	
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		graph = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				graph[i][j] = 1;
			}
		}
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int y=y1; y<y2; y++) {
				for(int x=x1; x<x2; x++) {
					graph[y][x] = 0;
				}
			}
		}
		
		int count = 0;
		areaList = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j] && graph[i][j] == 1) {
					area = 0;
					DFS(i, j);
					count++;
					areaList.add(area);
				}
			}
		}
		
		Collections.sort(areaList);
		System.out.println(count);
		for (int a : areaList) {
            System.out.print(a + " ");
        }
	}
	
	private static void DFS(int y, int x) {
		visited[y][x] = true;
		area++;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isValid(ny, nx) && !visited[ny][nx] && graph[ny][nx] == 1) {
				DFS(ny, nx);
			}
		}
	}
	
	private static boolean isValid(int y, int x) {
		return (x >= 0 && y >= 0 && x < N && y < M);
	}
}
