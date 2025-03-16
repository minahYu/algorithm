import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int days = 0;
		for(int i=0; i<x-1; i++) {
			days += dayOfMonth[i];
		}
		days += y;
		
		System.out.println(week[days%7]);
	}
}
