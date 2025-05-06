import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> nameToNum = new HashMap<>();
        Map<Integer, String> numToName = new HashMap<>();
		for(int i=1; i<=N; i++) {
            String name = br.readLine();
			numToName.put(i, name);
            nameToNum.put(name, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			String input = br.readLine();
			if(Character.isDigit(input.charAt(0))) {
				int num = Integer.parseInt(input);
                sb.append(numToName.get(num)).append("\n");
			} else {
				sb.append(nameToNum.get(input)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
