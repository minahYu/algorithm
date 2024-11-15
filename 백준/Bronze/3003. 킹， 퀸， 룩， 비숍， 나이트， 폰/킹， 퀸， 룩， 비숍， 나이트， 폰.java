import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] template = { 1, 1, 2, 2, 2, 8 };
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<6; i++) {
			sb.append(template[i] - sc.nextInt()).append(" ");
		}
		System.out.println(sb.toString());
	}
}
