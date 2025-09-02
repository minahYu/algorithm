import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] next = new int[N];
		boolean[] visited = new boolean[N];
		for(int i=0; i<N; i++) {
			next[i] = Integer.parseInt(br.readLine());
		}
		
		int cur = 0, count = 0;
		while(true) {
			if(cur == K) {
				System.out.println(count);
				return;
			}
			
			if(visited[cur]) {
				System.out.println(-1);
				return;
			}
			
			visited[cur] = true;
			cur = next[cur];
			count++;
		}
	}
}
