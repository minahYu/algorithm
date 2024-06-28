import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		boolean result = true;
		int num = 1;
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i] >= num) {
				while(arr[i] >= num) {
					stack.push(num);
					sb.append("+\n");
					num++;
				}
				stack.pop();
				sb.append("-\n");
			} else {
				if(stack.pop() < arr[i]) {
					result = false;
					System.out.println("NO");
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		if(result)
			System.out.println(sb.toString());
	}
}