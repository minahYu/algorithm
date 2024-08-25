import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		while(!str.equals(".")) {
			char[] chArr = str.toCharArray();
			Stack<Character> stack = new Stack<>();
			boolean complete = true;
			
			for(int i=0; i<chArr.length; i++) {
				switch(chArr[i]) {
				case '(':
				case '[':
					stack.push(chArr[i]);
					break;
				case ')':
					if(!stack.isEmpty() && stack.peek() == '(')
						stack.pop();
					else
						complete = false;
					break;
				case ']':
					if(!stack.isEmpty() && stack.peek() == '[')
						stack.pop();
					else
						complete = false;
					break;
				}

				if(!complete) {
					break;
				}
			}
			if(stack.isEmpty() && complete) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
			
			str = br.readLine();
		}
		System.out.println(sb.toString());
	}
}
