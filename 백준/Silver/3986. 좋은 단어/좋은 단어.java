import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i=0; i<N; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			stack.push(str.charAt(0));
			for(int j=1; j<str.length(); j++) {
				if(!stack.isEmpty() && stack.peek() == str.charAt(j)) {
					stack.pop();
				} else {
					stack.push(str.charAt(j));
				}
			}
			
			if(stack.isEmpty()) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
