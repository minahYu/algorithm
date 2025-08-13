import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	private static List<Integer> list;
	private static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		list = new ArrayList<>();
		for(int i=0; i<10; i++) {
			list.add(sc.nextInt());
		}
		
		dfs(0, 0, 0, 0);
		
		System.out.println(count);
	}
	
	private static void dfs(int idx, int prev1, int prev2, int score) {
		int remaining = 10 - idx;
		if(score + remaining < 5) {
			return;
		}
		
		if(idx == 10) {
			if(score >= 5) {
				count++;
			}
			return;
		}
		
		for(int i=1; i<=5; i++) {
			if(prev1 == prev2 && prev1 == i) {
				continue;
			}
			
			int add = (i == list.get(idx)) ? 1 : 0;
			dfs(idx+1, i, prev1, score+add);
		}
	}
}
