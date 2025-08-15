import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	private static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for(int i=0; i<N; i++) {
			char[] chArr = br.readLine().toCharArray();
			
			for(int j=0; j<N; j++) {
				arr[i][j] = chArr[j] - '0';
			}
		}
		
		StringBuilder sb = new StringBuilder();
		re(0, 0, N, sb);
		
		System.out.println(sb.toString());
	}
	
	private static void re(int r, int c, int size, StringBuilder sb) {
		boolean allSame = true;
		int first = arr[r][c];
		
		if(size == 1) {
			sb.append(first);
			return;
		}
		
		for(int i=r; i<r+size; i++) {
			for(int j=c; j<c+size; j++) {
				if(first != arr[i][j]) {
					allSame = false;
				}
			}
		}
		
		if(!allSame) {
			int s = size/2;
			sb.append("(");
			re(r, c, s, sb);
			re(r, c+s, s, sb);
			re(r+s, c, s, sb);
			re(r+s, c+s, s, sb);
			sb.append(")");
			return;
		} else {
			sb.append(first);
		}
	}
}
