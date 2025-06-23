import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	static class Balloon {
		int index;
		int move;
		
		Balloon(int index, int move) {
			this.index = index;
			this.move = move;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<Balloon> deque = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int move = Integer.parseInt(st.nextToken());
			deque.offer(new Balloon(i+1, move));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!deque.isEmpty()) {
			Balloon balloon = deque.pollFirst();
			sb.append(balloon.index).append(" ");
			
			int move = balloon.move;
			if(deque.isEmpty()) {
				break;
			}
			
			if(move > 0) {
				int step = (move - 1) % deque.size();
				for(int i=0; i<step; i++) {
					deque.offerLast(deque.pollFirst());
				}
			} else {
				int step = (-move) % deque.size();
				for(int i=0; i<step; i++) {
					deque.offerFirst(deque.pollLast());
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
