import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] cow = new int[10];
		boolean[] manyTimes = new boolean[10];
		
		int count = 0;
		for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            int cowNum = Integer.parseInt(input[0]) - 1;
            int street = Integer.parseInt(input[1]);
			
			if(!manyTimes[cowNum]) {
				manyTimes[cowNum] = true;
				cow[cowNum] = street;
			} else {
				if(cow[cowNum] != street) {
					count++;
					cow[cowNum] = street;
				}
			}
		}
		System.out.println(count);
	}
}
