import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String input = br.readLine();
		
		for(int i=0; i<strArr.length; i++) {
			input = input.replace(strArr[i], String.valueOf((char)(65+i)));
		}

		System.out.println(input.length());
	}
}
