import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[K];
		long max = 0, min = 1;
		for(int i=0; i<K; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			max = Math.max(nums[i], max);
		}

		while(min <= max) {
			long count = 0;
			long mid = (min + max) / 2;
			
			for(int i=0; i<K; i++) {
				count += nums[i] / mid;
			}
			
			if(count >= N) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		
		System.out.println(max);
	}
}
