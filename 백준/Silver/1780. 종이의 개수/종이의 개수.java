import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	private static int[][] paper;
	private static int[] counts = new int[3];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		recusion(0, 0, N);
		
		for(int i=0; i<3; i++) {
			System.out.println(counts[i]);
		}
	}
	
	private static void recusion(int i, int j, int size) {
		if(size == 1) {
			counts[paper[i][j]+1]++;
			return;
		}
		
		int first = paper[i][j];
		boolean same = true;
		for(int x=i; x<i+size; x++) {
			for(int y=j; y<j+size; y++) {
				if(first != paper[x][y]) {
					same = false;
					break;
				}
			}
		}
		
		if(same) {
			counts[first+1]++;
			return;
		}
		
		int n = size/3;
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				recusion(i+x*n, j+y*n, n);
			}
		}
	}
}
