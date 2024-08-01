import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	final static int MAX = 1000000;
	static boolean[] isPrime = new boolean[MAX+1];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=2; i<=MAX; i++) {
			isPrime[i] = true;
		}	
		calcPrimes();
		
		int N;
		while((N = Integer.parseInt(st.nextToken())) != 0) {
			boolean result = false;
			for(int i=3; i<=N/2; i+=2) {
				if(isPrime[i] && isPrime[N-i]) {
					sb.append(N)
					   .append(" = ")
					   .append(i)
					   .append(" + ")
					   .append((N-i))
					   .append("\n");
					result = true;
					break;
				}
			}

			if(!result) {
				sb.append("Goldbach’s conjecture is wrong").append("\n");
			}
			st = new StringTokenizer(br.readLine());
		}
		System.out.println(sb.toString());
	}
	
	private static void calcPrimes() {
		for(int i=2; i<=Math.sqrt(MAX); i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					isPrime[j] = false;
				}
			}

		}
	}
}
