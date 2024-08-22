import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String firstToken = st.nextToken();
			
			switch(firstToken) {
			case "1":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "2":
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				}
				break;
			case "3":
				System.out.println(stack.size());
				break;
			case "4":
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "5":
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	}
}
