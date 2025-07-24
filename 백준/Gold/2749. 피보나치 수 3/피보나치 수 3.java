import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int mod = 1_000_000;
	private static int p = 15 * mod / 10;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		int[] fibo = new int[p];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2; i<p; i++) {
			fibo[i] = (fibo[i-1] + fibo[i-2]) % mod;
		}
		
		System.out.println(fibo[(int) (n%p)]);
	}
}
