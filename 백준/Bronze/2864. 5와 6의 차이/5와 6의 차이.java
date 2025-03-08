import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = String.valueOf(sc.nextInt());
		String B = String.valueOf(sc.nextInt());
		String maxA = A, maxB = B, minA = A, minB = B;
		
		if(A.contains("5")) maxA = A.replace("5", "6");
		if(B.contains("5")) maxB = B.replace("5", "6");
		int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

		if(minA.contains("6")) minA = A.replace("6", "5");
		if(minB.contains("6")) minB = B.replace("6", "5");
		int min = Integer.parseInt(minA) + Integer.parseInt(minB);
		
		System.out.println(min + " " + max);
	}
}
