import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            deque.offer(i);
        }
        
        int count = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            int idx = deque.indexOf(target);
            int mid = deque.size() / 2;
            
            if (idx <= mid) {
                for (int i=0; i<idx; i++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            } else {
                for (int i=deque.size(); i>idx; i--) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }
        
        System.out.println(count);
    }
}
