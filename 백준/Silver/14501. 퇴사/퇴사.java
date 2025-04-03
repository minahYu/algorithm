import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] hourArr = new int[N];
		int[] moneyArr = new int[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			hourArr[i] = Integer.parseInt(st.nextToken());
			moneyArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[N+1];
		for(int i=N-1; i>=0; i--) {
			if(i + hourArr[i] <= N) {
				dp[i] = Math.max(dp[i+hourArr[i]]+moneyArr[i], dp[i+1]);
			} else {
				dp[i] = dp[i+1];
			}
		}
		
		System.out.println(dp[0]);
	}
}
