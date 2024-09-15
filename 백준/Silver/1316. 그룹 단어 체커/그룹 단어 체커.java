import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int[] countArr = new int[26];
			
			for(int j=0; j<countArr.length; j++) {
				countArr[j] = 0;
			}
			
			String str = br.readLine();
			char[] chArr = str.toCharArray();
			boolean next = false;
			
			char beforeCh = chArr[0];
			countArr[chArr[0]-97]++;
			
			for(int j=1; j<chArr.length; j++) {
				if(chArr[j] == beforeCh) {
					continue;
				}
				
				if(countArr[chArr[j]-97] != 0) {
					next = true;
				} else {
					countArr[chArr[j]-97]++;
				}
				beforeCh = chArr[j];
			}
			if(!next) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
