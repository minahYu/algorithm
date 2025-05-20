import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N+1];
		for(int i=1; i<=N; i++) {
			A[i] = sc.nextInt();
		}
		
		int[] dp = new int[N+1];
		for(int i=1; i<=N; i++) {
			dp[i] = 1;
			for(int j=1; j<i; j++) {
				if(A[i] > A[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
