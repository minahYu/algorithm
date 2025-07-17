import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> right = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			left.offer(num);
			if(!right.isEmpty() && (left.peek() > right.peek())) {
				int maxLeft = left.poll();
				int minRight = right.poll();
				left.offer(minRight);
				right.offer(maxLeft);
			}
			
			if(left.size() > right.size()+1) {
				right.offer(left.poll());
			}
			sb.append(left.peek()).append("\n");
		}
		System.out.println(sb.toString());
	}
}
