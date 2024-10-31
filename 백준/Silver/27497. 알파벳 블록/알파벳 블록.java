import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] arsg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Character> deque = new LinkedList<>();
		Deque<Integer> inputSequence = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			switch(str.charAt(0)) {
			case '1':
				deque.offerLast(str.charAt(2));
				inputSequence.push(1);
				break;
			case '2':
				deque.offerFirst(str.charAt(2));
				inputSequence.push(2);
				break;
			case '3':
				if(!deque.isEmpty()) {
					if(inputSequence.pop() == 2) {
						deque.pollFirst();
					} else {
						deque.pollLast();
					}
				}
				break;
			}
		}
		
		int size = deque.size();
		if(size == 0) {
			System.out.println("0");
		} else {
			StringBuilder sb = new StringBuilder();
			while (!deque.isEmpty()) {
				sb.append(deque.pollFirst());
			}
			System.out.println(sb);
		}	
	}
}
