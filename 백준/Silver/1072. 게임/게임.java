import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long y = sc.nextLong();
		long z = y * 100 / x;
				
		if(z >= 99) {
			System.out.println(-1);
			return;
		}
		
		long count = 0;
		long left = 1, right = x, mid = 0;
		long newZ = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			newZ = ((y + mid) * 100) / (x + mid);
			
			if(newZ > z) {
				count = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		System.out.println(count);
	}
}