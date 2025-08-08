import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		List<Integer> tails = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int num = arr[i];
			
			if(tails.isEmpty() || tails.get(tails.size()-1) < num) {
				tails.add(num);
			} else {
				int left = binarySearch(tails, num);
				tails.set(left, num);
			}
		}
		
		System.out.println(N-tails.size());
	}
	
	private static int binarySearch(List<Integer> tails, int num) {
		int left = 0, right = tails.size()-1;
				
		while(left < right) {
			int mid = (left + right) / 2;
			if(tails.get(mid) >= num) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		
		return left;
	}
}
