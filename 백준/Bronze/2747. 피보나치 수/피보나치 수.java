import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(fibo(N));
	}
	
	private static int fibo(int n) {
		if(n < 2) {
			return n;
		}
		
		int a = 0;
		int b = 1;
		for(int i=2; i<=n; i++) {
			int temp = a+b;
			a = b;
			b = temp;
		}
		return b;
	}
}
