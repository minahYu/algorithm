import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int peopleNum = sc.nextInt();
		String input = sc.next();
		
		int count = 0;
		char[] chArr = input.toCharArray();
		for(int i=0; i<peopleNum; i++) {
			count = (chArr[i] == 'A') ? count+1 : count-1;
		}
		
		if(count > 0) {
			System.out.println("A");
		} else if(count < 0) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
	}
}
