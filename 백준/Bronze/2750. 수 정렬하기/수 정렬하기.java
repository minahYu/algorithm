import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		for(int i=0; i<N; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<N; i++) {
			int min = i;
			
			for(int j=i; j<N; j++) {
				if(numArr[min] > numArr[j]) {
					min = j;
				}
			}
			
			if(numArr[min] < numArr[i]) {
				int temp = numArr[min];
				numArr[min] = numArr[i];
				numArr[i] = temp;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(numArr[i]);
		}
	}
}
