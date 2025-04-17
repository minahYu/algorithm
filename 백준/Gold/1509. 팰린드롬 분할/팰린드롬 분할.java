import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		int[] dp = new int[str.length()+1];
		boolean[][] isPalindrome = new boolean[str.length()+1][str.length()+1];
		
		for(int i=str.length(); i>=1; i--) {
			for(int j=i; j<=str.length(); j++) {
				if(arr[i-1] == arr[j-1]) {
					if(j-i <= 2) {
						isPalindrome[i][j] = true;
					} else {
						isPalindrome[i][j] = isPalindrome[i+1][j-1];
					}
				}
			}
		}
 		
		for(int i=1; i<dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j=1; j<=i; j++) {
				if(isPalindrome[j][i]) {
					dp[i] = Math.min(dp[j-1] + 1, dp[i]);
				}
			}
		}
		
		System.out.println(dp[str.length()]);
	}
}
