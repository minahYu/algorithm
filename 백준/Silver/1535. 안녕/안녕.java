import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] L = new int[N+1];
		int[] J = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			L[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			J[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[100];
		for(int i=1; i<=N; i++) {
			for(int hp=99; hp>=L[i]; hp--) {
				dp[hp] = Math.max(dp[hp], dp[hp - L[i]] + J[i]);
			}
		}
		
		int max = 0;
		for(int i=1; i<100; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
