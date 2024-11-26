import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int xOrY = Math.min(x, y);
		int wOrH = Math.min(w-x, h-y);
		
		System.out.println(Math.min(xOrY, wOrH));
	}
}
