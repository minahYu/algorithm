import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int[] stair = new int[n+1];
		int[] dp = new int[n+1];
		for(int i=1; i<stair.length; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = stair[1];
		if(n>=2) dp[2] = Math.max(stair[1] + stair[2], stair[2]);
		if(n>=3) dp[3] = Math.max(stair[1] + stair[3], stair[2] + stair[3]);
		
		for(int i=4; i<stair.length; i++) {
			dp[i] = Math.max(dp[i-3] + stair[i-1] + stair[i], dp[i-2] + stair[i]);	
		}
		
		System.out.println(dp[n]);
	}
}
