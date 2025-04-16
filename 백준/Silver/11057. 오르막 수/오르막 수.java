import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] dp = new int[N+1][10];
		
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=j; k++) {
					dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
				}
			}
		}
		
		int answer = 0;
		for(int j=0; j<=9; j++) {
			answer = (answer + dp[N][j]) % 10007;
		}
		
		System.out.println(answer);
	}
}
