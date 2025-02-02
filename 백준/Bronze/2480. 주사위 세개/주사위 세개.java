import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		if(arr[0] == arr[1]) {
			if(arr[1] == arr[2]) {
				System.out.println(10000 + arr[0]*1000);
			} else {
				System.out.println(1000 + arr[0]*100);
			}
		} else {
			if(arr[1] != arr[2]) {
				System.out.println(100*arr[2]);
			} else {
				System.out.println(1000 + arr[1]*100);
			}
		}
	}
}
