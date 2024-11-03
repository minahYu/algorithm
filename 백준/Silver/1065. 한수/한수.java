import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		if(N < 100) {
			count = N;
		} else {
			count = 99;
			
			for(int i=100; i<=N; i++) {				
				int[] nums = new int[(int)(Math.log10(i)) + 1];
				int j = (int)(Math.log10(i));
				int temp = i;
				
				while(temp >= 1) {
					nums[j] = temp % 10;
					temp /= 10;
					j--;
				}
				
				int diff = nums[0] - nums[1];
				boolean same = true;
				for(int k=1; k<nums.length-1; k++) {
					if(diff != nums[k] - nums[k+1]) {
						same = false;
						break;
					}
				}
				
				if(same) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
