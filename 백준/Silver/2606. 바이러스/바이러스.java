import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static boolean[] visited;
	private static List<List<Integer>> graph;
	private static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer = sc.nextInt();
		int couple = sc.nextInt();
		
		visited = new boolean[computer+1];
		graph = new ArrayList<>();
		
		for(int i=0; i<=computer; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<couple; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			graph.get(s).add(e);
			graph.get(e).add(s);
		}
		
		dfs(1);
		
		System.out.println(count);
	}
	
	private static void dfs(int v) {
		visited[v] = true;
		
		for(int i : graph.get(v)) {
			if(!visited[i]) {
				count++;
				dfs(i);
			}
		}
	}
}
