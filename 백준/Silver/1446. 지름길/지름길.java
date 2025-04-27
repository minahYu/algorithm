import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int[][] shortcuts = new int[N][3];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			shortcuts[i][0] = Integer.parseInt(st.nextToken());
			shortcuts[i][1] = Integer.parseInt(st.nextToken());
			shortcuts[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[D+1];
		for(int i=1; i<=D; i++) {
			dp[i] = dp[i-1] + 1;
		}
		
		for(int i=0; i<=D; i++) {
			if(i > 0) {
				dp[i] = Math.min(dp[i], dp[i-1] + 1);
			}
			
			for(int j=0; j<shortcuts.length; j++) {
				int start = shortcuts[j][0];
				int end = shortcuts[j][1];
				int distance = shortcuts[j][2];
				
				if(start == i && end <= D) {
					dp[end] = Math.min(dp[end], dp[i] + distance);
				}
			}	
		}
		
		System.out.println(dp[D]);
	}
}
