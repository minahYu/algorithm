import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			Queue<int[]> queue = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				int priority = Integer.parseInt(st.nextToken());
				queue.offer(new int[] {j, priority});
			}			
			
			int printOrder = 0;
			while(!queue.isEmpty()) {
				int[] current = queue.poll();
				boolean hasHigher = false;
				
				for(int[] docInfo : queue) {
					if(docInfo[1] > current[1]) {
						hasHigher = true;
						break;
					}
				}
				
				if(hasHigher) {
					queue.offer(current);
				} else {
					printOrder++;
					if(current[0] == M) {
						System.out.println(printOrder);
						break;
					}
				}
				
			}
		}
	}
}
