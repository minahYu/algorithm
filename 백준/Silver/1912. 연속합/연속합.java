import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());		
		int[] nums = new int[n+1];
		int[] dp = new int[n+1];
		for(int i=1; i<=n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = nums[1];
		for(int i=2; i<dp.length; i++) {
			dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
		}
		
		int max = dp[1];
		for(int i=2; i<dp.length; i++) {
			max = Math.max(dp[i], max);
		}
		
		System.out.println(max);
	}
}
