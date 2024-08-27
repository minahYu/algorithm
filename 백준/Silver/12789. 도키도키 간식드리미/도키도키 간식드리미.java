import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		int sequence = 1;
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		while(!(queue.isEmpty() && stack.isEmpty())) {
			if(!stack.isEmpty() && stack.peek() == sequence) {
				stack.pop();
				sequence++;
				continue;
			}
			
			if(!queue.isEmpty()) {
				if(queue.peek() == sequence) {
					queue.remove();
					sequence++;
				} else {
					stack.push(queue.remove());
				}
			} else {
				if(!stack.isEmpty() && stack.peek() != sequence) {
					System.out.println("Sad");
					return;
				}
			}
		}
		System.out.println("Nice");
	}
}
