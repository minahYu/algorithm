import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.next();
		float score = 0;
		
		if(grade.contains("A")) {
			score = 4;
		} else if(grade.contains("B")) {
			score = 3;
		} else if(grade.contains("C")) {
			score = 2;
		} else if(grade.contains("D")) {
			score = 1;
		}
		
		if(grade.contains("+")) {
			score += 0.3;
		} else if(grade.contains("-")) {
			score -= 0.3;
		}
		
		System.out.println(score);
	}
}
