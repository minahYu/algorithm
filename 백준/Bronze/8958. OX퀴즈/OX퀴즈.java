import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
			
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			int count = 0;
			int sum = 0;
			
			st = new StringTokenizer(br.readLine());
			String token = st.nextToken();
			
			for(char ch : token.toCharArray()) {
				if(ch == 'X') {
					count = 0;
				} else {
					count++;
				}
				sum += count;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb.toString());
	}
}
