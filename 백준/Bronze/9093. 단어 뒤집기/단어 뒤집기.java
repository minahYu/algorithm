import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()) {
				StringBuilder token = new StringBuilder(st.nextToken());
				sb.append(token.reverse().toString()).append(" ");	
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
