import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean exist = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
	
		for(int i=0; i<T; i++) {
			Stack<Character> stack = new Stack<>();
			st = new StringTokenizer(br.readLine());
			String token = st.nextToken();
			
			exist = checkVps(stack, token);
			
			if(exist)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	private static boolean checkVps(Stack<Character> stack, String token) {
		for(char ch : token.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			} else if(ch == ')') {
				if(stack.isEmpty())
					return false;
				else
					stack.pop();
			}
		}
		return stack.isEmpty();
	}
}