import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static int[] selected;
	static int[] numbers;
	static int k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		k = 1;
		while(k > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			k = Integer.parseInt(st.nextToken());
			
			selected = new int[6];
			numbers = new int[k];
			
			for(int i=0; i<k; i++) {
				numbers[i] = Integer.parseInt(st.nextToken());
			}
			
			DFS(0, 0);
			System.out.println();
			
		}
	}
	
	private static void DFS(int start, int depth) {
		if(depth == 6) {
			for(int num : selected) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<k; i++) {
			selected[depth] = numbers[i];
			DFS(i+1, depth+1);
		}
	}
}
