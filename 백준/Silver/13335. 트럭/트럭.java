import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Queue<Integer> waiting = new LinkedList<>();
        for (int i=0; i<N; i++) {
            waiting.offer(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i=0; i<W; i++) {
            bridge.offer(0);
        }

        int time = 0, currentWeight = 0;
        while (!bridge.isEmpty()) {
            time++;
            currentWeight -= bridge.poll();

            if (!waiting.isEmpty()) {
                int next = waiting.peek();
                if (currentWeight + next <= L) {
                    bridge.offer(waiting.poll());
                    currentWeight += next;
                } else {
                    bridge.offer(0);
                }
            }
        }

        System.out.println(time);
    }
}
