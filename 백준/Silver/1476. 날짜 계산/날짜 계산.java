import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1;
		}
		
		int count = 1;
		while(true) {
			if(arr[0] == E && arr[1] == S && arr[2] == M) {
				break;
			}
			
			arr[0]++;
			arr[1]++;
			arr[2]++;
			
			if(arr[0] > 15) arr[0] = 1;	
			if(arr[1] > 28) arr[1] = 1;
			if(arr[2] > 19) arr[2] = 1;
			
			count++;
		}
		System.out.println(count);
	}
}
