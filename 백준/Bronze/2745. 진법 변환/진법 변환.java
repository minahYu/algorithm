import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		String N = strArr[0];
		
		int B = Integer.parseInt(strArr[1]);
		long answer = 0;
		
		for(int i=0; i<N.length(); i++) {
			char ch = N.charAt(i);
			int value = 0;
			
			if(Character.isDigit(ch)) {
				value = ch - '0';
			} else {
				value = ch - 'A' + 10;
			}
			
			answer += (value * Math.pow(B, N.length()-(i+1)));
		}
		System.out.println(answer);
	}
}
