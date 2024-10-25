import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char chArr[] = sc.next().toCharArray();
		int count = 0;
		for(int i=0; i<chArr.length; i++) {
			switch(chArr[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		
		System.out.println(count);
	}
}
