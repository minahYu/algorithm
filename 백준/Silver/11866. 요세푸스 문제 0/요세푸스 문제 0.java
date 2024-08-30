import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			queue.offer(i);
		}
		
		int count = 1;
		sb.append("<");
		while(!queue.isEmpty()) {
			if(count % K == 0) {
				sb.append(queue.poll());
				if(!queue.isEmpty()) {
					sb.append(", ");
				}
			} else {
				queue.offer(queue.poll());
			}
			count++;
		}
		sb.append(">");
		System.out.println(sb.toString());
	}
}
