import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		while((str = br.readLine()) != null) {
			int A = str.charAt(0) - '0';
			int B = str.charAt(2) - '0';
			
			System.out.println(A + B);
		}
	}
}
