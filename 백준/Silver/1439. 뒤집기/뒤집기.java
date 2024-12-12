import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static int zeroCount = 0, oneCount = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		boolean isOne = false;
		char before = s.charAt(0);
	
		isOne = checkZero(s.charAt(0)-'0');
		zeroOrOneCount(isOne);	
		
		for(int i=1; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(before != ch) {
				isOne = checkZero(ch-'0');
				zeroOrOneCount(isOne);	
				before = ch;
			}
		}
		System.out.println(Math.min(zeroCount, oneCount));
	}
	
	private static boolean checkZero(int num) {
		boolean isOne = false;
		
		if(num == 1) {
			isOne = true;
		} 
		return isOne;
	}
	
	private static void zeroOrOneCount(boolean isOne) {
		if(isOne) {
			oneCount++;
		} else {
			zeroCount++;
		}
	}
}
