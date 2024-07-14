import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			boolean decimal = arr[i] == 1 ? false : true;
			
			for(int j=2; j<=Math.sqrt(arr[i]); j++) {
				if(arr[i]%j == 0) {
					decimal = false;
				}
			}
			if(decimal) {
				count++;
			}
		}
		System.out.println(count);
	}
}
