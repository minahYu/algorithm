import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {		
			for(int j=N-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				if(j == 0 || j == 2*i-2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
