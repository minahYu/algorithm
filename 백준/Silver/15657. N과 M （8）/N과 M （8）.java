import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static int[] arr, sequence;
	static int N, M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
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
		
		for(int i=start; i<N; i++) {
			sequence[depth] = arr[i];
			dfs(i, depth+1);
		}
	}
}
