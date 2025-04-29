import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		
		int X = Integer.parseInt(br.readLine());
		int start = 0, end = N-1;
		int count = 0;
		
		while(start < end) {
			if(nums[start] + nums[end] <  X) {
				start++;
			} else if(nums[start] + nums[end] > X) {
				end--;
			} else {
				count++;
				start++;
				end--;
			}
		}
		
		System.out.println(count);
	}
}
