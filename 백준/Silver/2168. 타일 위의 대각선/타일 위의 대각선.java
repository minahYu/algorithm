import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x + y - gcd(x, y));
	}
	
	private static int gcd(int a, int b) {
		int tmp = 0;
		
		while(b != 0) {
			tmp = a%b;
			a = b;
			b = tmp;
		}
		
		return a;
	}
}
