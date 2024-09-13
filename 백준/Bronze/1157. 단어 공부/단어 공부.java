import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		char[] chArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<chArr.length; i++) {
			map.put(chArr[i], map.getOrDefault(chArr[i], 0) + 1);
		}
		
		List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
			
		if(map.size() > 1 && entryList.get(0).getValue().equals(entryList.get(1).getValue())) {
			System.out.println("?");
		} else {
			System.out.println(entryList.get(0).getKey());
		}
	}
}