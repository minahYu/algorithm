import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<Integer, List<Character>> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		
		int alphabet = 65;
		int count = 3;
		char numCh = '0';
		
		for(int i=1; i<=10; i++) {
			count = (i == 7 | i == 9) ? 4 : 3;
			
			map.put(i+1, new ArrayList<>());
			
			numCh = (i < 10) ? (char)(i + '0') : '0';
			map.get(i+1).add(numCh);
			
			if(i > 1 && alphabet <= 90) {
				for(int j=0; j<count; j++) {
					map.get(i+1).add((char)alphabet);
					alphabet++;
				}
			}
		}
		
		String str = br.readLine();
		for(char ch : str.toCharArray()) {
			for(Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
				if(entry.getValue().contains(ch)) {
					answer += entry.getKey();
				}
			}
		}
		
		System.out.println(answer);
	}
}
