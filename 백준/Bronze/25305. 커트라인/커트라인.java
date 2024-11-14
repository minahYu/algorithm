import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
		
		int[] scores = new int[N];
		String[] strArr = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			scores[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(scores);
		
		System.out.println(scores[scores.length - k]);
	}
}
