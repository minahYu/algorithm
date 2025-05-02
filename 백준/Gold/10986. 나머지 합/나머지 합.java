import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] modCount = new long[M];
		long sum = 0;
		long count = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
			int mod = (int)(sum % M);
			if(mod == 0) count++;
			
			modCount[mod]++;
		}
		
		for(int i=0; i<M; i++) {
			if(modCount[i] > 1) {
				count += (modCount[i] * (modCount[i]-1)) / 2;
			}
		}
		
		System.out.println(count);
	}
}
