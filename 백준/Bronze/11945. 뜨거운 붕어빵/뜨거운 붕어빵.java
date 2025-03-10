import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			char[] arr = (br.readLine()).toCharArray();
			
			for(int j=0; j<M; j++) {
				stack.push(arr[j]);
			}

			for(int j=0; j<M; j++) {
				sb.append(stack.pop());
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
