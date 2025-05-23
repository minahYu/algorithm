import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] T = new int[N+1];
		int[] P = new int[N+1];
		int[] dp = new int[N+2];
		
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
			
			dp[i] = Math.max(dp[i], dp[i-1]);
			if(i + T[i] <= N+1) {
					dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
			}
		}
		
		int max = 0;
		for(int i=1; i<=N+1; i++) {
			max = Math.max(dp[i], max);
		}
		
		System.out.println(max);
	}
}
