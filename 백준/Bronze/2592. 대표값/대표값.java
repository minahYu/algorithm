import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] numArr = new int[10];
		int sum = 0;
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = sc.nextInt();
			sum += numArr[i];
			map.put(numArr[i], map.getOrDefault(numArr[i], 0) + 1);
		}
		
		int mode = 0;
		int max = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				mode = entry.getKey();
			}
		}
		System.out.println(sum/10);
		System.out.println(mode);
	}
}
