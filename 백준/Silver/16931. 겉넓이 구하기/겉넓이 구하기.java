import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<M; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		long area = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(a[i][j] > 0) {
					area += 2;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			area += a[i][0];
			for(int j=1; j<M; j++) {
				area += Math.abs(a[i][j] - a[i][j-1]);
			}
			area += a[i][M-1];
		}
		
		for(int j=0; j<M; j++) {
			area += a[0][j];
			for(int i=1; i<N; i++) {
				area += Math.abs(a[i][j] - a[i-1][j]);
			}
			area += a[N-1][j];
		}
		
		System.out.println(area);
	}
}
