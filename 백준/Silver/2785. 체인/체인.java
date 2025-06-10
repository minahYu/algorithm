import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i<N; i++) {
        	deque.offer(arr[i]);
        }
        
        int answer = 0;
        while(deque.size() > 1) {
        	answer++;
        	
        	int num1 = deque.pollLast();
        	int num2 = deque.pollLast();
        	deque.offerLast(num1 + num2);
        	
        	if(deque.size() > 1) {
        		int num = deque.poll();
        		if(num > 1) {
        			deque.offerFirst(num-1);
        		}
        	}
        }
        
        System.out.println(answer);
    }
}
