import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String[] strArr = new String[N];
		
		if(N > 1) {
			for(int i=0; i<N; i++) {
				strArr[i] = br.readLine();
			}
			
			for(int i=0; i<strArr[0].length(); i++) {
				boolean same = true;
				char ch = strArr[0].charAt(i);
				for(int j=1; j<N; j++) {
					if(ch != strArr[j].charAt(i)) {
						same = false;
						break;
					}
					ch = strArr[j].charAt(i);
				}
				
				if(same) {
					sb.append(ch);
				} else {
					sb.append('?');
				}
			}
		} else {
			sb.append(br.readLine());
		}
		System.out.println(sb.toString());
	}
}
