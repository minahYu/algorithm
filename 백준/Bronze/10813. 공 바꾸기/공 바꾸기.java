import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N];
		for(int i=0; i<basket.length; i++) {
			basket[i] = i+1;
		}
		
		int temp = 0;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			temp = basket[a-1];
			basket[a-1] = basket[b-1];
			basket[b-1] = temp;
		}
		
		for(int i=0; i<basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
		
	}
}
