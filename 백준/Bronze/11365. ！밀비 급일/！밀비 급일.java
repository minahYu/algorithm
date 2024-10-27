import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(!(str = br.readLine()).equals("END")) {
			char[] chArr = str.toCharArray();
			for(int i=chArr.length-1; i >= 0; i--) {
				sb.append(chArr[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
