import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String seats = sc.next();
		
		char[] seatInfo = seats.toCharArray();
		int cupHolder = 1;
		
		for(int i=0; i<seatInfo.length; i++) {
			if(seatInfo[i] == 'S') {
				cupHolder++;
			} else if(seatInfo[i] == 'L') {
				cupHolder++;
				i++;
			}
		}
		
		System.out.println(Math.min(cupHolder, N));
	}
}
