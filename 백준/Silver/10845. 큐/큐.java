import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Integer> queue = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				queue.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop(queue)).append("\n");
				break;
			case "size":
				sb.append(size(queue)).append("\n");
				break;
			case "empty":
				sb.append(empty(queue)).append("\n");
				break;
			case "front":
				sb.append(front(queue)).append("\n");
				break;
			case "back":
				sb.append(back(queue)).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
	
	private static int size(List<Integer> queue) {
		return queue.size();
	}
	
	private static int empty(List<Integer> queue) {
		if(queue.isEmpty())
			return 1;
		return 0;
	}
	
	private static int pop(List<Integer> queue) {
		if(empty(queue) == 0) {
			return queue.remove(0);
		}
		return -1;
	}	
	
	private static int front(List<Integer> queue) {
		if(empty(queue) == 0) {
			return queue.get(0);
		}
		return -1;
	}	
	
	private static int back(List<Integer> queue) {
		if(empty(queue) == 0) {
			return queue.get(size(queue)-1);
		}
		return -1;
	}
}
