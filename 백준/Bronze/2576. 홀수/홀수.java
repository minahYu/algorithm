import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		boolean hasOdd = false;
		
		for(int i=0; i<7; i++) {
			int n = sc.nextInt();
			
			if(n%2 != 0) {
				hasOdd = true;
				sum += n;
				if(min > n) {
					min = n;
				}
			}
		}
		if(!hasOdd) {
			System.out.println(-1);
		} else {
			System.out.println(sum + "\n" + min);
		}
	}
}
