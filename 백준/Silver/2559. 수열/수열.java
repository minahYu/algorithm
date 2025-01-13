import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] temperatures = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<temperatures.length; i++) {
			temperatures[i] = Integer.parseInt(st.nextToken());
		}
		
		int leftIndex = 0;
		int rightIndex = K-1;
		
		int sum = 0;
		for(int i=leftIndex; i<=rightIndex; i++) {
			sum += temperatures[i];
		}
		
		int answer = sum;
		
		while(rightIndex < N-1) {
			sum += temperatures[++rightIndex];
			sum -= temperatures[leftIndex++];
			
			if(sum > answer) {
				answer = sum;
			}
		}
		System.out.println(answer);
	}
}
