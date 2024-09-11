import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] baskets = new int[N];
		
		for(int i=0; i<N; i++) {
			baskets[i] = i+1;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a != b) {
				for(int j=a-1; j<b; j++) {
					queue.offer(baskets[j]);
				}

				for(int j=b-1; j>= a-1; j--) {
					baskets[j] = queue.poll();
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(baskets[i] + " ");
		}
	}
}
