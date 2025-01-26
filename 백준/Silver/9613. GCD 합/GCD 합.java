import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());		
		StringBuilder sb = new StringBuilder();		
		
		for(int i=0; i<t; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<n; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			long answer = 0;
			for(int j=0; j<list.size()-1; j++) {
				for(int l=j+1; l<list.size(); l++) {
					answer += GCD(list.get(j), list.get(l));
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return GCD(b, a%b);
		}
	}
}
