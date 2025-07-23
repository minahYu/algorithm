import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long[][] a = new long[N][N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				a[i][j] = Integer.parseInt(st.nextToken()) % 1000;
			}
		}
		
		long[][] answer = pow(a, b);
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static long[][] pow(long[][] a, long b) {
		long[][] answer = init();
		
		while(b > 0) {
			if(b%2 == 1) {
				answer = multiply(answer, a);
			}
			
			a = multiply(a, a);
			b /= 2;
		}
		
		return answer;
	}
	
	private static long[][] multiply(long[][] answer2, long[][] b) {
		long[][] answer = new long[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				answer[i][j] = 0;
				for(int k=0; k<N; k++) {
					answer[i][j] = (answer[i][j] + answer2[i][k] * b[k][j]) % 1000;
				}
			}
		}
		return answer;
	}
	
	private static long[][] init() {
	    long[][] a = new long[N][N];
	    
	    for (int i = 0; i < N; i++) {
	        a[i][i] = 1;
	    }
	    return a;
	}

}
