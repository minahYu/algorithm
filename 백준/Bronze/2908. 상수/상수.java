import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int newA = 0;
		int newB = 0;
		int len = (int)Math.log10(A);
		for(int i=0; i<len; i++) {
			newA += (A % 10)*(int)(Math.pow(10, (int)(len-i)));
			newB += (B % 10)*(int)(Math.pow(10, (int)(len-i)));
			A /= 10;
			B /= 10;
		}			
		newA += A;
		newB += B;
		
		System.out.println(Math.max(newA, newB));
	}
}
