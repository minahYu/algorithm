import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static final int MAX = 100001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int target = sc.nextInt();

        int[] visited = new int[MAX];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (now == target) {
                System.out.println(visited[now]-1);
                return;
            }

            int[] nextMoves = {now-1, now+1, now*2};
            for (int next : nextMoves) {
                if (next >= 0 && next < MAX && visited[next] == 0) {
                    visited[next] = visited[now]+1;
                    queue.add(next);
                }
            }
        }
    }
}
