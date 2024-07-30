import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String D = sc.next();
		
		Long sum = Long.parseLong(A + B) + Long.parseLong(C + D);
		System.out.println(sum);
	}
}
