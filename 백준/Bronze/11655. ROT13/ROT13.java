import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S = br.readLine();
		
		for(char ch : S.toCharArray()) {
			if('A' <= ch && ch <= 'Z') {
				ch = (char)((ch - 'A' + 13) % 26 + 'A');
			} else if('a' <= ch && ch <= 'z') {
				ch = (char)((ch - 'a' + 13) % 26 + 'a');
			}
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}