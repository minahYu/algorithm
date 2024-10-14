import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nums = sc.next();
		
		Integer[] numArr = new Integer[nums.length()];
		for(int i=0; i<nums.length(); i++) {
			numArr[i] = Character.getNumericValue(nums.charAt(i));
		}
		
		Arrays.sort(numArr, Collections.reverseOrder());
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}
}
