import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bowls = sc.next();
		
		int answer = 10;
		char before = bowls.charAt(0);
		for(int i=1; i<bowls.length(); i++) {
			char bowl = bowls.charAt(i);
			
			answer += (bowl == before) ? 5 : 10;
			before = bowl;
		}
		System.out.println(answer);
	}
}
