import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		boolean find = false;
		
		for(int i=L; i<=100; i++) {
			int temp = N - (i * (i-1)) / 2;
			
			if(temp < 0) {
				break;
			}
			
			if(temp % i == 0) {
				int a = temp / i;
				for(int j=0; j<i; j++) {
					System.out.print((a + j) + " ");
				}
				find = true;
				break;
			}
		}
		
		if(!find) {
			System.out.println(-1);
		}
	}
}
