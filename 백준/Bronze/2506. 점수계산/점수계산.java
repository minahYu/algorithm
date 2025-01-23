import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		int result = 0;
		int sequence = 1;
		for(int i=0; i<N; i++) {
			int grading = sc.nextInt();
			
			if(grading == 0) {
				sequence = 1;
			}
			
			if(grading == 1) {
				result += sequence;			
				sequence++;
			}
		}
		
		System.out.println(result);
	}
}
