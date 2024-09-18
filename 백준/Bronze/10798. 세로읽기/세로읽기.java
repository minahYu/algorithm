import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] strArr = new char[5][15];
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				strArr[i][j] = ' ';
			}
		}
		
		for(int i=0; i<strArr.length; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				strArr[i][j] = str.charAt(j);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int j=0; j<15; j++) {
			for(int i=0; i<5; i++) {
				if(strArr[i][j] != ' ') {
					sb.append(strArr[i][j]);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
