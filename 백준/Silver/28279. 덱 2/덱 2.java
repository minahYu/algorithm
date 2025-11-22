import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	private static int[] deque = new int[2000000];
	private static int head = 1000000;
	private static int tail = 1000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String[] input = (br.readLine()).split(" ");
			
			switch(Integer.parseInt(input[0])) {
			case 1:
				pushFirst(Integer.parseInt(input[1]));
				break;
			case 2:
				pushLast(Integer.parseInt(input[1]));
				break;
			case 3:
				sb.append(popFirst()).append("\n");
				break;
			case 4:
				sb.append(popLast()).append("\n");
				break;
			case 5:
				sb.append(dequeSize()).append("\n");
				break;
			case 6:
				sb.append(isEmpty()).append("\n");
				break;
			case 7:
				sb.append(peekFirst()).append("\n");
				break;
			case 8:
				sb.append(peekLast()).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
	
	private static void pushFirst(int x) {
		deque[--head] = x;
	}
	
	private static void pushLast(int x) {
		deque[tail++] = x;
	}
	
	private static int popFirst() {
		if(isEmpty() == 1) return -1;
		return deque[head++];
	}
	
	private static int popLast() {
		if(isEmpty() == 1) return  -1;
		return deque[--tail];
	}
	
	private static int dequeSize() {
		return tail - head;
	}
	
	private static int isEmpty() {
		return head == tail ? 1 : 0;
	}
	
	private static int peekFirst() {
		if(isEmpty() == 1) return  -1;
		return deque[head];
	}
	
	private static int peekLast() {
		if(isEmpty() == 1) return  -1;
		return deque[tail-1];
	}
}
