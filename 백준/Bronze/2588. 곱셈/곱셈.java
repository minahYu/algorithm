import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int bLength = (int)(Math.log10(B)+1);
		int sum = 0;
		
		for(int i=0; i<bLength; i++) {
			System.out.println(A * (B % 10));
			if(i > 0) {
				sum += A * (B % 10) * Math.pow(10, i);
			} else {
				sum += A * (B % 10);
			}
			B /= 10;
		}
		System.out.println(sum);
	}
}
