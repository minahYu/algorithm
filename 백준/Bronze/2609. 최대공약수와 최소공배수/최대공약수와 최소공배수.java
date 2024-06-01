import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int gcd = gcd(A, B);
		int lcm = A * (B / gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		
		return gcd(b, a%b);
	}

}
