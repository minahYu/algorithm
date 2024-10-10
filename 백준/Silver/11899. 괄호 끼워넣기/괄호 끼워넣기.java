import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] chArr= str.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == ' ') {
				continue;
			}
			
			if(!stack.isEmpty() && (stack.peek() == '(' && chArr[i] == ')')) {
				stack.pop();
			} else {
				stack.push(chArr[i]);
			}
		}
		System.out.println(stack.size());
	}
}