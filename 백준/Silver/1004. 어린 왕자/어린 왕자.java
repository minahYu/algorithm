import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] points = new int[4];
		for(int i=0; i<T; i++) {
			int count = 0;
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<points.length; j++) {
				points[j] = Integer.parseInt(st.nextToken());
			}
			
			int n = Integer.parseInt(br.readLine());
			for(int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				boolean startInside = ((points[0]-cx)*(points[0]-cx) + (points[1]-cy)*(points[1]-cy) < r*r);
				boolean endInside = ((points[2]-cx)*(points[2]-cx) + (points[3]-cy)*(points[3]-cy) < r*r);
			
				if(startInside != endInside) count++;
			}
			System.out.println(count);
		}
	}
}
