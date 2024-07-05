import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			char current = input.charAt(i);			
			if(current == '(') {
				stack.push(current);
			} else {
				stack.pop();
				if(input.charAt(i-1) == '(')
					count += stack.size();
				else
					count++;
			}
		}
		System.out.println(count);
	}
}
