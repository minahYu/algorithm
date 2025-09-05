import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static final int INF = 1_000_000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] cost = new int[N][3];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int answer = INF;
		for(int i=0; i<3; i++) {
			int[][] dp = new int[N][3];
			
			for(int j=0; j<3; j++) {
				dp[0][j] = (i == j) ? cost[0][j] : INF;
			}
			
			for(int k=1; k<N; k++) {
				dp[k][0] = cost[k][0] + Math.min(dp[k-1][1], dp[k-1][2]);
				dp[k][1] = cost[k][1] + Math.min(dp[k-1][0], dp[k-1][2]);
				dp[k][2] = cost[k][2] + Math.min(dp[k-1][0], dp[k-1][1]);
			}
			
			for(int k=0; k<3; k++) {
				if(i == k) {
					continue;
				}
				answer = Math.min(answer, dp[N-1][k]);
			}
		}
		
		System.out.println(answer);
	}
}
