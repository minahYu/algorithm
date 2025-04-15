import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			
			long[] dp = new long[N+1];
			dp[1] = 1;
			if(N > 1) dp[2] = 1;
			if(N > 2) dp[3] = 1;
			
			for(int j=4; j<=N; j++) {
				dp[j] = dp[j-3] + dp[j-2];
			}
			sb.append(dp[N]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
