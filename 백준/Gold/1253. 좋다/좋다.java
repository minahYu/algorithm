import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
		
		int count = 0;
		for(int i=0; i<N; i++) {
			int start = 0, end = N-1;
			
			while(start < end) {
				if(start == i) {
					start++;
					continue;
				}
				if(end == i) {
					end--;
					continue;
				}
				
				int sum = nums[start] + nums[end];
				
				if(sum == nums[i]) {
					count++;
					break;
				} else if(sum < nums[i]) {
					start++;
				} else {
					end--;
				}
			}
		}
		
		
		System.out.println(count);
	}
}
