import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum = 1, count = 1;
	
		while(sum < N) {
			sum += (6 * count);
			count++;
		}
		
		System.out.println(count);
	}
}
