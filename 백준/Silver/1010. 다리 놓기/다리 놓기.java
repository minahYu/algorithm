import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[][] dp = new int[31][31];
		for(int n=1; n<dp.length; n++) {
			dp[n][0] = 1;
			dp[n][n] = 1;
			for(int r=1; r<n; r++) {
				dp[n][r] = dp[n-1][r-1] + dp[n-1][r];
			}
		}
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(dp[M][N]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
