import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		stack.push(0);
		for(int i=1; i<N; i++) {
			while(!stack.isEmpty() && list.get(i) > list.get(stack.peek())) {
				list.set(stack.pop(), list.get(i));
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			list.set(stack.pop(), -1);
		}
		
		for(int i=0; i<N; i++) {
			sb.append(list.get(i)).append(" ");
		}
		System.out.println(sb.toString());
	}
}
