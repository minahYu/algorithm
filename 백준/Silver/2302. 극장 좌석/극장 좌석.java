import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i=2; i<=N; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        int[] vip = new int[M+2];
        vip[0] = 0;
        for (int i=1; i<=M; i++) {
            vip[i] = Integer.parseInt(br.readLine());
        }
        vip[M+1] = N+1;

        int result = 1;
        for (int i=1; i<=M+1; i++) {
            int diff = vip[i] - vip[i-1] - 1;
            result *= dp[diff];
        }

        System.out.println(result);
    }
}
