import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());
			char[] chArr = (st.nextToken()).toCharArray();
			
			for(int j=0; j<chArr.length; j++) {
				for(int z=0; z<count; z++) {
					sb.append(chArr[j]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
