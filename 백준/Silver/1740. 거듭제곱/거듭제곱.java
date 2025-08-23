import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long answer = 0, pow = 1;
        while (N > 0) {
            if ((N % 2) == 1) {
                answer += pow;
            }
            pow *= 3;
            N /= 2;
        }
        System.out.println(answer);
    }
}
