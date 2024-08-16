import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[9];
		nums[0] = Integer.parseInt(br.readLine());
		int index = 0;
		int max = nums[0];
		for(int i=1; i<9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			if(max < nums[i]) {
				index = i;
				max = nums[i];
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}
}
