import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] chArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] >= 'a' && chArr[i] <= 'z') {
				sb.append(String.valueOf(chArr[i]).toUpperCase());
			} else {
				sb.append(String.valueOf(chArr[i]).toLowerCase());
			}
		}
		System.out.println(sb.toString());
	}
}
