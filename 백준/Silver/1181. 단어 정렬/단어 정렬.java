import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(br.readLine());
		}
		
		String[] strArr = new String[set.size()];
		int index = 0;
		for(String str : set) {
			strArr[index] = str;
			index++;
		}
		
		Arrays.sort(strArr, (a, b) -> {
			if(a.length() == b.length()) {
				return a.compareTo(b);
			} else {
				return a.length() - b.length();
			}
		});
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
