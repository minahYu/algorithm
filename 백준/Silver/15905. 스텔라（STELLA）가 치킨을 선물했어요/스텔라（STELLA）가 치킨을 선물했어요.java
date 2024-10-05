import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] strArr = new String[N];
		for(int i=0; i<N; i++) {
			strArr[i] = br.readLine();
		}
		
		Arrays.sort(strArr);
		
		char fifthNum = strArr[N-5].charAt(0);
		int count = 0;
		
		for(int i=N-(5+1); i>=0; i--) {		
			if(strArr[i].charAt(0) == fifthNum) {
				count++;
			}
		}
		System.out.println(count);
	}
}
