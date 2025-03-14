import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		Arrays.sort(nums);
		
		System.out.println(sum/5);
		System.out.println(nums[2]);
	}
}
