import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<String[]> list = new ArrayList<>(); 
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String age = st.nextToken();
			String name = st.nextToken();
			list.add(new String[] {age, name, String.valueOf(i)});
		}
		
		list.sort((a, b) -> {
			int ageA = Integer.parseInt(a[0]);
			int ageB = Integer.parseInt(b[0]);
			if(ageA == ageB) {
				return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
			}
			return Integer.compare(ageA, ageB);
		});
		
		StringBuilder sb = new StringBuilder();
		for(String[] personInfo : list) {
			sb.append(personInfo[0]).append(" ").append(personInfo[1]).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
