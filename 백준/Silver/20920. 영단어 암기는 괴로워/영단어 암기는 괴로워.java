import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String word = br.readLine();
			
			if(word.length() >= M) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}
		
		List<String> keySet = new ArrayList<>(map.keySet());
		
		keySet.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(map.get(o2).compareTo(map.get(o1)) == 0) {
					if(Integer.compare(o2.length(), o1.length()) == 0) {
						return o1.compareTo(o2);
					}
					return Integer.compare(o2.length(), o1.length());
				}
				return map.get(o2).compareTo(map.get(o1));
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String word : keySet) {
			sb.append(word).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
