import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[N][N];		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=2; i<=N; i++) {
			for(int n=0; n<=N-i; n++) {
				int m = n+i-1;
				dp[n][m] = Integer.MAX_VALUE;
				
				for(int k=n; k<m; k++) {
					dp[n][m] = Math.min(dp[n][m], dp[n][k] + dp[k+1][m] + arr[n][0] * arr[k][1] * arr[m][1]);
				}
			}
 		}
		
		System.out.println(dp[0][N-1]);
	}
}
