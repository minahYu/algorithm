import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int K = sc.nextInt();
		
		long answer = 1;
		int[] arr = new int[K];
		for(int i=0; i<arr.length; i++) {
			arr[i] = S/K;
		}
		
		for(int i=0; i<S%K; i++) {
			arr[i]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			answer *= arr[i];
		}
		System.out.println(answer);
	}
}
