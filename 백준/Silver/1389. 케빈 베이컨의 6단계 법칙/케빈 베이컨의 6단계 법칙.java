import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	private static List<Integer>[] friendship;
	private static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		friendship = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			friendship[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			friendship[s].add(e);
			friendship[e].add(s);
		}
		
		int minSum = Integer.MAX_VALUE;
		int answer = 0;
		for(int i=1; i<=N; i++) {
			int sum = bfs(i);
			if(sum < minSum || (sum == minSum && i < answer)) {
				minSum = sum;
				answer = i;
			}
		}
		
		System.out.println(answer);
	}
	
	private static int bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N+1];
		int[] dist = new int[N+1];
		
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			for(int next : friendship[current]) {
				if(!visited[next]) {
					visited[next] = true;
					dist[next] = dist[current]+1;
					queue.offer(next);
				}
			}
		}
		
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum += dist[i];
		}
		
		return sum;
	}
}