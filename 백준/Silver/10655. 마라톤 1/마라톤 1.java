import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {	
	private static int[] x;
	private static int[] y;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		x = new int[N];
		y = new int[N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		long base = 0;
		for(int i=1; i<N; i++) {
			base += dist(i-1, i);
		}
		
		long maxSave = 0;
		for(int i=1; i<N-1; i++) {
			maxSave = Math.max(maxSave, dist(i-1, i) + dist(i, i+1) - dist(i-1, i+1));
		}
		
		System.out.println(base - maxSave);
	}
	
	private static long dist(int i, int j) {
		return Math.abs((long)x[i]-x[j]) + Math.abs((long)y[i]-y[j]);
	}
}
