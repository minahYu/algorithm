import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		boolean[][] paper = new boolean[100][100];
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				paper[i][j] = false;
			}
		}
		
		for(int count = 0; count<4; count++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
		
			for(int i=startX; i<endX; i++) {
				for(int j=startY; j<endY; j++) {
					if(!paper[i][j]) {
						paper[i][j] = true;
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
