import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pos = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> neg = new PriorityQueue<>(Collections.reverseOrder());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num > 0) {
				pos.offer(num);
			} else {
				neg.offer(Math.abs(num));
			}
		}
		
		int furthest = 0;
		if(!pos.isEmpty()) {
			furthest = Math.max(furthest, pos.peek());
		}
		if(!neg.isEmpty()) {
			furthest = Math.max(furthest, neg.peek());
		}
				
		long answer = 0;
		while(!pos.isEmpty()) {
			answer += pos.poll() * 2L;
			for(int i=1; i<M && !pos.isEmpty(); i++) {
				pos.poll();
			}
		}

		while(!neg.isEmpty()) {
			answer += neg.poll() * 2L;
			for(int i=1; i<M && !neg.isEmpty(); i++) {
				neg.poll();
			}
		}
		
		answer -= furthest;
		
		System.out.println(answer);
	}
}
