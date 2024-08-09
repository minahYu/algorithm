import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		for(int i=0; i<N.length(); i++) {
			int num = Character.getNumericValue(N.charAt(i));
			String binaryStr = Integer.toBinaryString(num);
			
			if(i==0) {
				sb.append(binaryStr);
			} else {
				sb.append(String.format("%03d", Integer.parseInt(binaryStr)));
			}
		}
		System.out.println(sb.toString());
	}
}
