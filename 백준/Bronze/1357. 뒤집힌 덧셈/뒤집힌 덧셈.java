import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
	
		int answer = intReverse(intReverse(X) + intReverse(Y));
	
		System.out.println(answer);
	}
	
	private static int intReverse(int num) {
		int reverseNum = 0;	
		int len = (int)(Math.log10(num)) + 1;
		
		for(int i=len-1; i>0; i--) {
			reverseNum += (num % 10) * (Math.pow(10, i));
			num /= 10;
		}
		reverseNum += num;
		
		return reverseNum;
	}
}
