import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int firstLine = (A + B) % C;
		System.out.println(firstLine);
		System.out.println(firstLine % C);
		
		int thirdLine = (A * B) % C;
		System.out.println(thirdLine);
		System.out.println(thirdLine % C);
	}
}
