import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		for(int i=0; i<8; i++) {
			char[] chArr = br.readLine().toCharArray();
			for(int j=0; j<chArr.length; j++) {
				if(i%2 == 0 && j%2 == 0) {
					if(chArr[j] == 'F') {
						count++;
					}
				} else if(i%2 == 1 && j%2 == 1) {
					if(chArr[j] == 'F') {
						count++;
					}
				}
			}
		}
	
		System.out.println(count);
	}
}
