import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine().toString();
		String[] sArr = S.split(" ");
		
		int count = 0;
		for(int i=0; i<sArr.length; i++) {
			if(!sArr[i].isEmpty()) 
				count++;
		}
		System.out.println(count);
	}
}
