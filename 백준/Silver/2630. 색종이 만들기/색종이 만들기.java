import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static int[][] arr;
	private static int white = 0, blue = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}
	
	private static void partition(int r, int c, int size) {
		if(checkColor(r, c, size)) {
			if(arr[r][c] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
			
		int half = size/2;
		
		partition(r, c, half);
		partition(r, c + half, half);
		partition(r + half, c, half);
		partition(r + half, c + half, half);
	}
	
	private static boolean checkColor(int r, int c, int size) {
		int cur = arr[r][c];
		
		for(int i=r; i<r+size; i++) {
			for(int j=c; j<c+size; j++) {
				if(arr[i][j] != cur) {
					return false;
				}
			}
		}
		return true;
	}
}
