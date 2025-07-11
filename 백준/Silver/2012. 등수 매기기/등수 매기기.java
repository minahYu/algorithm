import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] expectation = new int[N];
		for(int i=0; i<N; i++) {
			expectation[i] = Integer.parseInt(br.readLine());
		}
	
		Arrays.sort(expectation);
		
		long answer = 0;
		for(int i=0; i<N; i++) {
			int rank = i+1;
			answer += Math.abs(rank - expectation[i]);
		}
		
		System.out.println(answer);
		
	}
}
