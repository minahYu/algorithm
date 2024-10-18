import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
        for (int i = 0; i < str.length(); i += 10) {
            if (i + 10 <= str.length()) {
                sb.append(str.substring(i, i + 10)).append("\n");
            } else {
                sb.append(str.substring(i)).append("\n");
            }
        }
		System.out.println(sb.toString());
	}
}
