import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.next().split(":");
		
		int A = Integer.parseInt(strArr[0]);
		int B = Integer.parseInt(strArr[1]);

		int gcd = gcd(A, B);
		
		A /= gcd;
		B /= gcd;
		
		System.out.println(A + ":" + B);
	}
	
	private static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
}
