import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			Set<String> set = new HashSet<>();
			
			String groupName = br.readLine();
			int numOfPeople = Integer.parseInt(br.readLine());
			for(int j=0; j<numOfPeople; j++) {
				set.add(br.readLine());
			}
			
			List<String> list = new ArrayList<>(set);
			Collections.sort(list);
			map.put(groupName, list);
		}
		
		for(int i=0; i<M; i++) {
			String quiz = br.readLine();
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				for(String member : map.get(quiz)) {
					System.out.println(member);
				}
			} else if(num == 1) {
				String answer = "";
				for(Map.Entry<String, List<String>> group : map.entrySet()) {
					if(group.getValue().contains(quiz)) {
						answer = group.getKey();
						break;
					}
				}
				System.out.println(answer);
			}
		}
	}
}