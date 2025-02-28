import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int[] coins = { 25, 10, 5, 1 };
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int[] coinCounts = new int[4];
			int cent = sc.nextInt();
			
			for(int j=0; j<coins.length; j++) {
				if(cent >= coins[j]) {
					coinCounts[j] += cent / coins[j];
					cent %= coins[j];
				}
				sb.append(coinCounts[j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
