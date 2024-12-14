import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			String[] fileInfo = str.split("\\.");
			map.put(fileInfo[1], map.getOrDefault(fileInfo[1], 0) + 1);
		}
		
		List<String> keySet = new ArrayList<>(map.keySet());
		keySet.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(String key : keySet) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
