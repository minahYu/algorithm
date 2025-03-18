import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int min = 0;
		for(int i=N-1; i>=0; i--) {
			for(int j=i; j>=0; j--) {
				min += arr[j];
			}
		}
		System.out.println(min);
	}
}
