import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
	
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
			answer.add(num);
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}
		
		for(int i=0; i<N; i++) {
			while(!stack.isEmpty() && map.get(list.get(stack.peek())) < map.get(list.get(i))) {
				answer.set(stack.pop(), list.get(i));
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			answer.set(stack.pop(), -1);
		}
	
		for(int i=0; i<N; i++) {
			sb.append(answer.get(i)).append(" ");
		}
		System.out.println(sb.toString());
	}
}
