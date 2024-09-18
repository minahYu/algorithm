import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		boolean[][] paper = new boolean[100][100];

		for(int i=0; i<N; i++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(!paper[j][k]) {
						paper[j][k] = true;
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
