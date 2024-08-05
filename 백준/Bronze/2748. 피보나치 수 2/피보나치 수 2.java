import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long current = 1;
		long before = 0;
		long result = 0;
		if(N < 2) {
			System.out.println(N);
			return;
		}
		for(int i=2; i<=N; i++) {
			result = before + current;
			before = current;
			current = result;
		}
		System.out.println(result);
	}
}
