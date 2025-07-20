import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final int P = 1_000_000_007;
    static long[] factorial;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        factorial = new long[N+1];
        factorial[0] = 1;
        for(int i=1; i<=N; i++) {
        	factorial[i] = (factorial[i-1] * i) % P;
        }
        
        long numerator = factorial[N];
        long denominator = (factorial[K] * factorial[N-K]) % P;
        
        System.out.println(numerator * pow(denominator, P-2) % P);
    }
    
    private static long pow(long n, long m) {
    	long result = 1;
    	
    	while(m > 0) {
    		if(m%2 == 1) {
    			result *= n;
    			result %= P;
    		}
    		
    		n = (n * n) % P;
    		m /= 2;
    	}
    	
    	return result;
    }
}
