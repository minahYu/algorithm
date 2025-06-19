import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String T = br.readLine();

        while (sb.length() < T.length()) {
            char last = T.charAt(T.length() - 1);
            T = T.substring(0, T.length() - 1);
            if (last == 'B') {
                T = new StringBuilder(T).reverse().toString();
            }
        }

        System.out.println(sb.toString().equals(T) ? 1 : 0);
    }
}
