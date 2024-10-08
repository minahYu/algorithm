import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			queue.offer(i);
		}
		
		int i = 0;
		while(queue.size() != 1) {
			if(i%2 == 0) {
				sb.append(queue.poll()).append(" ");
			} else {
				queue.offer(queue.poll());
			}
			i++;
		}
		sb.append(queue.poll()).append(" ");
		
		System.out.println(sb.toString());
	}
}
