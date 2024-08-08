import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		while(N.length() % 3 != 0) {
			N = "0" + N;
		}
		
		int[] format = {1, 2, 4};
		int[] answer = new int[N.length()/3];
		
		char[] ch = N.toCharArray();
		for(int i=0; i<N.length(); i++) {
			answer[i/3] += Character.getNumericValue(ch[i]) * format[2-(i%3)];
		}
		
		boolean add = false;
		if(answer.length < 2)
			add = true;
		for(int i=0; i<answer.length; i++) {
			if(answer.length > 1 && answer[i] != 0) {
				add = true;
			}
			if(add)
				sb.append(answer[i]);
		}
		System.out.println(sb.toString());
	}
}
