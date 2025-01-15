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
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i<K) {
				sum += arr[i];
			}
		}
		
		int answer = sum;
		for(int i=1; i<N; i++) {
			sum = sum - arr[(i-1)%N] + arr[(i+K-1)%N];		
			answer = Math.max(answer, sum);
		}
		
		System.out.println(answer);
	}
}
