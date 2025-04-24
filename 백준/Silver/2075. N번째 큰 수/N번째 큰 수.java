import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N*N];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(count != 0 && count%N == 0) {
				st = new StringTokenizer(br.readLine());
			}
			arr[i] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-N]);
	}
}
