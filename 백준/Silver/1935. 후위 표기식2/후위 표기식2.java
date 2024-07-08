import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> number = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		String postfix = br.readLine();
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		double answer = 0;
		char[] chArr = postfix.toCharArray();
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				double num = nums[chArr[i] - 'A'];
				number.push(num);
			} else {
				double num1 = number.pop();
				double num2 = number.pop();
				answer = calc(num2, num1, chArr[i]);
				number.push(answer);
			}
		}
		System.out.printf("%.2f", number.pop());
	}
	
	private static double calc(double num1, double num2, char operator) {
		double answer = 0;
		
		switch(operator) {
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		}
		return answer;
	}
}
