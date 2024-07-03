import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
	private static List<Integer> deque = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push_front":
				deque.add(0, Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back":
				sb.append(pop_back()).append("\n");
				break;
			case "size":
				sb.append(size(deque)).append("\n");
				break;
			case "empty":
				sb.append(empty(deque)).append("\n");
				break;
			case "front":
				sb.append(front(deque)).append("\n");
				break;
			case "back":
				sb.append(back(deque)).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
	
	private static int pop_front() {
		if(empty(deque) == 1)
			return -1;
		return deque.remove(0);
	}
	
	private static int pop_back() {
		if(empty(deque) == 1)
			return -1;
		return deque.remove(size(deque)-1);
	}
	
	private static int size(List<Integer> deque) {
		return deque.size();
	}
	
	private static int empty(List<Integer> deque) {
		if(size(deque) == 0)
			return 1;
		return 0;
	}
	
	private static int front(List<Integer> deque) {
		if(size(deque) == 0)
			return -1;
		return deque.get(0);
	}
	
	private static int back(List<Integer> deque) {
		if(size(deque) == 0)
			return -1;
		return deque.get(size(deque)-1);
	}
}
