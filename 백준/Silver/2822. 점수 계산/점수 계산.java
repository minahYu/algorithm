import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<8; i++) {
			map.put(i, Integer.parseInt(br.readLine()));
		}
		List<Integer> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet, (v1, v2) -> map.get(v2).compareTo(map.get(v1)));
	
		int sum = 0;
		int count = 0;
		int[] indexArr = new int[5];
		for(Integer key : keySet) {
			if(count == 5) {
				break;
			}
			sum += map.get(key);
			indexArr[count] = key;
			count++;
		}
		
		StringBuilder sb = new StringBuilder();
		Arrays.sort(indexArr);
		for(int i=0; i<indexArr.length; i++) {
			sb.append(indexArr[i]+1).append(" ");
		}
		
		System.out.println(sum);
		System.out.println(sb.toString());
	}
}
