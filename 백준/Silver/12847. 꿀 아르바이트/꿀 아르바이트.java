import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] T = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			T[i] = Long.parseLong(st.nextToken());
		}
	
		long sum = 0;
		for(int i=0; i<m; i++) {
			sum += T[i];
		}
		
		long max = sum;
		for(int i=m; i<n; i++) {
			sum = sum - T[i-m] + T[i];
			max = Math.max(max, sum);
		}

		System.out.println(max);
	}
}
