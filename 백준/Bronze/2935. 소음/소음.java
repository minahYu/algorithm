import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = new BigInteger(sc.next());
		char ch = sc.next().charAt(0);
		BigInteger B = new BigInteger(sc.next());
		
		if(ch == '+') {
			System.out.println(A.add(B));
		} else if(ch == '*') {
			System.out.println(A.multiply(B));
		}
		
	}
}
