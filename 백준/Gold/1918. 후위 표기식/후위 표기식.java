import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	static Stack<Character> operator = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static int response = 4;
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(char ch : br.readLine().toCharArray()) {
			if('A' <= ch & ch <= 'Z') {
				sb.append(ch);				
			} else if(ch == '(') {
				operator.push(ch);
			} else if(ch == ')') {
				while(!operator.isEmpty() && operator.peek() != '(') {
						sb.append(operator.pop());
					}
					operator.pop();
			} else {
				while(!operator.isEmpty() && getPriority(operator.peek()) >= getPriority(ch)) {
					sb.append(operator.pop());
				}
				operator.push(ch);
			}
		}
		
		while(!operator.isEmpty()) {
			sb.append(operator.pop());
		}
		System.out.println(sb.toString());
	}
	
	private static int getPriority(char ch) {
		if(ch == '(' || ch == ')') {
			response = 1;
		} else if(ch == '*' || ch == '/') {
			response = 3;
		} else if(ch == '+' || ch == '-') {
			response = 2;
		} 
		return response;
	}
}
