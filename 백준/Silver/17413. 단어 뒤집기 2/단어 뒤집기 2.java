import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
	private static boolean word = true;
		
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "<> ", true);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			char[] chArr = token.toCharArray();
			
			for(int i=0; i<chArr.length; i++) {
				checkWordOrNot(chArr[i]);
				
				if(word)
					stack.push(chArr[i]);
			}
			
			for(int i=0; i<chArr.length; i++) {	
				checkWordOrNot(chArr[i]);
				
				if(word && !stack.isEmpty()) {
					sb.append(stack.pop());
				} else {
					sb.append(chArr[i]);
				}
			}
		}
		System.out.println(sb.toString());
	}
	
	private static void checkWordOrNot(char ch) {
		if(ch == '<')
			word = false;
		else if(ch == '>')
			word = true;
	}
}