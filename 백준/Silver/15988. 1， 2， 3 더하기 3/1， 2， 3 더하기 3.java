import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		int MAX = 1000000;
		long[] dp = new long[MAX+1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
			
		for(int i=4; i<=MAX; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
		}
		
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			sb.append(dp[n]).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
