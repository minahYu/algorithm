import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String bookName = br.readLine();
			map.put(bookName, map.getOrDefault(bookName, 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort((e1, e2) -> {
			int valueCompare = e2.getValue().compareTo(e1.getValue());
			
			if(valueCompare != 0) {
				return valueCompare;
			}
			return e1.getKey().compareTo(e2.getKey());
		});
		
		System.out.println(entryList.get(0).getKey());
	}
}
