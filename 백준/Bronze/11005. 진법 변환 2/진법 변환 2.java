import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		int B = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(N > 0) {
			int remain = (int) (N % B);
			N /= B;
			
			if(remain < 10) {
				sb.insert(0, (char)(remain + '0'));
			} else {
				sb.insert(0, (char)(remain - 10 + 'A'));
			}
		}
		
		System.out.println(sb.toString());
	}
}
