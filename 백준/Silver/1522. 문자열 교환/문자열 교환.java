import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] chArr = str.toCharArray();
		int aCount = 0;
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == 'a') {
				aCount++;
			}
		}
		
		int start = 0, end = aCount;
		int min = Integer.MAX_VALUE;
		String doubled = str + str;
		for(int i=start; i<chArr.length; i++) {
			int bCount = 0;
			for(int j=i; j<i+end; j++) {
				if(doubled.charAt(j) == 'b') {
					bCount++;
				}
			}
			min = Math.min(min, bCount);
		}
		
		System.out.println(min);
	}
}