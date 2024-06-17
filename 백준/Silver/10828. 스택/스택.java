import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> stack = new ArrayList<>();
		
		int orderCount = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<orderCount; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				stack.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop(stack);
				break;
			case "size":
				sb.append(size(stack) + "\n");
				break;
			case "empty":
				sb.append(empty(stack) + "\n");
				break;
			case "top":
				sb.append(top(stack) + "\n");
				break;	
			}
		}
		
		System.out.println(sb);
	}
	
	private static void pop(List<Integer> stack) {
		if(size(stack) == 0) {
			sb.append(-1 + "\n");
		} else {
			sb.append(top(stack) + "\n");
			stack.remove(size(stack) - 1);
		}
	}
	
	
	private static int size(List<Integer> stack) {
		return stack.size();
	}
	
	private static int empty(List<Integer> stack) {
		if(size(stack) == 0)
			return 1;	
		else
			return 0;
	}
	
	private static int top(List<Integer> stack) {
		if(empty(stack) == 1) {
			return -1;
		} else {
			return stack.get(size(stack)-1);
		}
	}
}
