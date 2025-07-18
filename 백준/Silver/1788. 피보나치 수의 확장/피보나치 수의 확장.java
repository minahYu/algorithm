import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int absN = Math.abs(n);
        int[] fibo = new int[absN + 2];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i=2; i<=absN; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % MOD;
        }

        int result = fibo[absN];
        int sign;
        if(n == 0) {
            sign = 0;
        } else if(n > 0) {
            sign = 1;
        } else {
            sign = (n % 2 == 0) ? -1 : 1;
        }

        System.out.println(sign);
        System.out.println(result);
    }
}
