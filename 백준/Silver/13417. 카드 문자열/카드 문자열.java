import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			String[] alphaArr = br.readLine().split(" ");
			char[] chArr = new char[alphaArr.length];
			
			for(int j=0; j<N; j++) {
				chArr[j] = alphaArr[j].charAt(0);
			}
			
			Deque<Character> deque = new LinkedList<>();
			for(int j=0; j<N; j++) {
				if(deque.isEmpty()) {
					deque.offerFirst(chArr[j]);
					continue;
				} else {
					if(deque.peek() >= chArr[j]) {
						deque.offerFirst(chArr[j]);
					} else {
						deque.offerLast(chArr[j]);
					}
				}
			}
			
			for(char ch : deque) {
				sb.append(ch);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
