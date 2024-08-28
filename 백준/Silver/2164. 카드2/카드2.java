import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		
		int N = scanner.nextInt();
		
		for(int i=1; i<=N; i++) {
			myQueue.add(i);
		}
		
		while(myQueue.size() > 1) {
			myQueue.poll();
			int temp = myQueue.poll();
			myQueue.offer(temp);
		}
		
		System.out.println(myQueue.poll());
	}
}
