import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int answer = 1;
			
			Map<String, Integer> map = new HashMap<>();
			for(int j=0; j<N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String clothes = st.nextToken();
				String category = st.nextToken();
				
				map.put(category, map.getOrDefault(category, 0) + 1);
			}
			
			for(String category : map.keySet()) {
				answer *= (map.get(category) + 1);
			}
			answer--;
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}
}
