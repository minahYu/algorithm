import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] tree = new int[T+1];
        for (int i=1; i<=T; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        int[][] dp = new int[T+1][W+1];
        for (int t=1; t<=T; t++) {
            for (int w=0; w<=W; w++) {
                int currentPos = (w%2 == 0) ? 1 : 2;
                int gain = (tree[t] == currentPos) ? 1 : 0;

                dp[t][w] = dp[t-1][w] + gain;

                if (w > 0) {
                    dp[t][w] = Math.max(dp[t][w], dp[t-1][w-1] + gain);
                }
            }
        }

        int max = 0;
        for (int w=0; w<=W; w++) {
            max = Math.max(max, dp[T][w]);
        }

        System.out.println(max);
    }
}
