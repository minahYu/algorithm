import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String commute = st.nextToken();
			
			if(commute.equals("enter")) {
				set.add(name);
			} else if(commute.equals("leave")) {
				set.remove(name);
			}
		}
		
		String[] strArr = new String[set.size()];
		int i = 0;
		for(String name : set) {
			strArr[i] = name;
			i++;
		}
		
		Arrays.sort(strArr, Collections.reverseOrder());
	
		for(int j=0; j<strArr.length; j++) {
			System.out.println(strArr[j]);
		}
	}
}