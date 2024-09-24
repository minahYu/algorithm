import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 1;
 		int lineCount = 1; 

		while(N > sum) {
			sum += ++lineCount;
		}
			
		int inLineCount = N - sum + lineCount;
		
		int denominator = 1, numerator = 1;
		
		if(lineCount%2 != 0) {
			denominator = inLineCount;
			numerator = lineCount + 1 - inLineCount;
		} else {
			denominator = lineCount + 1 - inLineCount;
			numerator = inLineCount;
		}
		
		System.out.println(numerator + "/" + denominator);
	}
}
