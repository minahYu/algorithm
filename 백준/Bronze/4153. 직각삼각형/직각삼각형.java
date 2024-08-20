import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums);
		while(nums != null) {
			if(nums.equals("0 0 0")) {
				return;
			}
			int[] numArr = new int[3];
			numArr[0] = Integer.parseInt(st.nextToken());
			numArr[1] = Integer.parseInt(st.nextToken());
			numArr[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(numArr);
			
			if(Math.pow(numArr[0], 2) + Math.pow(numArr[1], 2) == Math.pow(numArr[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
			nums = br.readLine();
			st = new StringTokenizer(nums);
		}
	}
}
