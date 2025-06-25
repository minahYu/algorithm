import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int score = 0;
		int A = 0, T = 1;
        
		Stack<int[]> stack = new Stack<>();
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int homework = Integer.parseInt(st.nextToken());
			if(homework == 1) {
				if(A > 0 && T > 0) {
					stack.add(new int[] {A, T});
				}
				
				A = Integer.parseInt(st.nextToken());
				T = Integer.parseInt(st.nextToken());
			}
			T--;
			
			if(T == 0) {
				score += A;
				if(!stack.isEmpty()) {
					int[] homeworkInfo = stack.pop();
					A = homeworkInfo[0];
					T = homeworkInfo[1];
				}
			}
        }
		System.out.println(score);
	}
}