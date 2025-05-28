import java.util.Scanner;

public class Main {
    static final int MOD = 15746;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(n);
            return;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }

        System.out.println(dp[n]);
    }
}
