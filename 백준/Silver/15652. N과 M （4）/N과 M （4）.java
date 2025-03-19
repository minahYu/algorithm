import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static int[] arr, sequence;
	static int M, N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		sequence = new int[M];
		
		dfs(0, 1);
	}
	
	private static void dfs(int depth, int start) {
		if(depth == M) {
			for(int num : sequence) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<=N; i++) {
				sequence[depth] = i;
				dfs(depth+1, i);
		}
	}
}
