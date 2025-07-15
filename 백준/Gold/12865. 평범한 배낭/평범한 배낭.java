import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] W = new int[N+1];
		int[] V = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
		}
		
		int[][] dp = new int[N+1][K+1];
		for(int i=1; i<=N; i++) {
			for(int j=0; j<=K; j++) {
				if(j < W[i]) {
					dp[i][j] = dp[i-1][j];	
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]] + V[i]);
				}
			}
		}
		System.out.println(dp[N][K]);
	}
}
