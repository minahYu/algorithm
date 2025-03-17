import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	static boolean[] visited;
	static int[] arr, sequence;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		visited = new boolean[N];
		sequence = new int[M];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0, 0);
	}
	
	private static void dfs(int start, int depth) {
		if(M == depth) {
			for(int num : sequence) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		int prev = -1;
		for(int i=start; i<N; i++) {
			if(!visited[i] && prev != arr[i]) {
				visited[i] = true;
				sequence[depth] = arr[i];
				prev = arr[i];
				dfs(i+1, depth+1);
				visited[i] = false;
			}
		}
	}
}