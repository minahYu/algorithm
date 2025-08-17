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
		int[] arr = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int num = arr[i];
			
			if(list.isEmpty() || list.get(list.size()-1) < num) {
				list.add(num);
			} else {
				int left = binarySearch(list, num);
				list.set(left, num);
			}
		}
		
		System.out.println(N-list.size());
	}
	
	private static int binarySearch(List<Integer> list, int num) {
		int left = 0, right = list.size()-1;
		
		while(left < right) {
			int mid = (left + right) / 2;
			
			if(list.get(mid) >= num) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		
		return left;
	}
}
