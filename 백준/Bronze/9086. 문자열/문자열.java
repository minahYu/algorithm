import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			String str = sc.next();			
			if(str.length() < 1) {
				sb.append(str).append(str).append("\n");
			} else {
				sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
			}			
		}
		System.out.println(sb.toString());
	}
}
