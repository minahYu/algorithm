import java.util.Scanner;

public class Main {
	static int[] arr;
	static int N, M;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		dfs(0);
		System.out.println(sb.toString());
	}
	
	private static void dfs(int depth) {
		
		if(depth == M) {
			for(int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=N; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
	}
}
