import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(!(str = br.readLine()).equals("#")) {
			int count = 0;
			str = str.toLowerCase();
			for(char ch : str.toCharArray()) {
				for(int i=0; i<vowel.length; i++) {
					if(ch == vowel[i]) {
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb.toString());
	}
}
