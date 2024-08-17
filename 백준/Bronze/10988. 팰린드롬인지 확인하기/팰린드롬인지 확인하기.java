import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String reverseStr = "";
		
		char[] chArr = str.toCharArray();
		for(int i=chArr.length-1; i>=0; i--) {
			reverseStr += chArr[i];
		}
		
		if(str.equals(reverseStr)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
