import java.util.Queue;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		sb.append("<");
		while(!queue.isEmpty()) {
			if(count == K) {
				sb.append(queue.poll());
				count = 1;
				if(!queue.isEmpty()) {
					sb.append(", ");
				}
			} else {
				queue.add(queue.poll());
				count++;
			}
		}
		sb.append(">");
		System.out.println(sb.toString());
	}
}
