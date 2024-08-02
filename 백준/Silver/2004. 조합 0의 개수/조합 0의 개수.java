import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int count5 = countFactor(N, 5) - countFactor(N-M, 5) - countFactor(M, 5);
		int count2 = countFactor(N, 2) - countFactor(N-M, 2) - countFactor(M, 2);
		
		System.out.println(Math.min(count5, count2));
	}
	
	private static int countFactor(int n, int m) {
		int count = 0;
		
		while(n >= m) {
			count += n/m;
			n /= m;
		}

		return count;
	}
}
