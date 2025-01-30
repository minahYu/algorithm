import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		Long multiply = (long) (A * B * C);
		
		String str = multiply.toString();
		
		int[] arr = new int[10];
		for(char ch : str.toCharArray()) {
			arr[ch-'0']++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
