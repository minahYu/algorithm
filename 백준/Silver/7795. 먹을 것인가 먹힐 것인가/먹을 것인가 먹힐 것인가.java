import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] A = new int[N];
			int[] B = new int[M];

			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				A[j] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				B[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(B);
			
			int count = 0;
			for(int num : A) {
				count += binarySearch(B, num);
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static int binarySearch(int[] arr, int num) {
		int start = 0, end = arr.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			if(arr[mid] < num) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		
		return start;
	}
}
