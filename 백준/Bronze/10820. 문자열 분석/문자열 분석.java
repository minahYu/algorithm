import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            if (str.isEmpty()) {
                break;
            }
            int[] arr = new int[4];
            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    arr[0]++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    arr[1]++;
                } else if (ch >= '0' && ch <= '9') {
                    arr[2]++;
                } else if (ch == ' ') {
                    arr[3]++;
                }
            }
            sb.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]).append(" ").append(arr[3]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
