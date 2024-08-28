import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		int lastNum = 0;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String token = st.nextToken();
			switch(token) {
			case "push":
				lastNum = Integer.parseInt(st.nextToken());
				queue.offer(lastNum);
				break;
			case "pop":
				sb.append(pop(queue)).append("\n");
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				sb.append(empty(queue)).append("\n");
				break;
			case "front":
				sb.append(front(queue)).append("\n");
				break;
			case "back":
				sb.append(back(queue, lastNum)).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
	
	private static int pop(Queue<Integer> queue) {
		if(empty(queue) == 1) {
			return -1;
		} else {
			return queue.poll();
		}
	}
	
	private static int empty(Queue<Integer> queue) {
		if(queue.size() == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private static int front(Queue<Integer> queue) {
		if(empty(queue) == 1) {
			return -1;
		} else {
			return queue.peek();
		}
	}
	
	private static int back(Queue<Integer> queue, int lastNum) {
		if(empty(queue) == 1) {
			return -1;
		} else {
			return lastNum;
		}
	}
}
