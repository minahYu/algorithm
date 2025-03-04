import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            
            int sum = 0;
            StringBuilder temp = new StringBuilder();
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    temp.append(i).append(" + ");
                }
            }
            
            if (sum == n) {
                sb.append(n).append(" = ").append(temp.substring(0, temp.length() - 3));
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
