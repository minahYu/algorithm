import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int start = 1, end = 1;
		int sum = 1;
		int count = 0;
		
		while(start <= N) {
			if(sum == N) {
				count++;
			}
			
			if(sum < N) {
				end++;
				sum += end;
			} else {
				sum -= start;
				start++;
			}
		}
		
		System.out.println(count);
	}
}
