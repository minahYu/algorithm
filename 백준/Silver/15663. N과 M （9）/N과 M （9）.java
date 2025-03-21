import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static boolean[] visited;
	static int[] arr, sequence;
	static int N, M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		visited = new boolean[N];
		arr = new int[N];
		
		sequence = new int[M];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		dfs(0, 0);
	}
	
	private static void dfs(int start, int depth) {
		if(depth == M) {
			for(int num : sequence) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		int prev = -1;
		for(int i=0; i<N; i++) {
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
