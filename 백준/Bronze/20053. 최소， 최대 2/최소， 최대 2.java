import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int j=0; j<N; j++) {
				int token = Integer.parseInt(st.nextToken());
				min = Math.min(min, token);
				max = Math.max(max, token);
			}
			System.out.println(min + " " + max);
		}
	}
}
