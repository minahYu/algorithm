import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] strArr = new String[N];
		boolean[] visited = new boolean[N];
		for(int i=0; i<N; i++) {
			strArr[i] = br.readLine();
		}
		
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				String part = strArr[i].substring(0, strArr[j].length());
				if(part.equals(strArr[j])) {
					visited[j] = true;
				}
			}
		}
		
		int count = 0;
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
