import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static int[][] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new int[N][M];
		int[][] B = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<M; j++) {
				A[i][j] = line.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<M; j++) {
				B[i][j] = line.charAt(j) - '0';
			}
		}
		
		int count = 0;
		for(int i=0; i<=N-3; i++) {
			for(int j=0; j<=M-3; j++) {
				if(A[i][j] != B[i][j]) {
					flip(i, j);
					count++;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(A[i][j] != B[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(count);
	}
	
	private static void flip(int i, int j) {
		for(int x=i; x<i+3; x++) {
			for(int y=j; y<j+3; y++) {
				A[x][y] = 1 - A[x][y];
			}
		}
	}
}
