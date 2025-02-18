import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int count;
	static int S;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());		
		int N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		count = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		DFS(0, 0);
		
		if(S == 0) count--;
		System.out.println(count);
	}
	
	private static void DFS(int depth, int sum) {
		if(arr.length == depth) {
			if(sum == S) count++;
			return;
		}
		
		DFS(depth + 1, sum + arr[depth]);
		DFS(depth + 1, sum);
	}
}
