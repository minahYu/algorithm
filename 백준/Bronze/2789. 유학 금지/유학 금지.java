import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String university = "CAMBRIDGE";
		
		for(char ch : university.toCharArray()) {
			str = str.replace(String.valueOf(ch), "");
		}
		
		System.out.println(str);
	}
}
