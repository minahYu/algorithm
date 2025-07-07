import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    static char[][] map;
    static boolean[][] visited;
    
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        map = new char[N][M];
        visited = new boolean[N][M];
        int startX = 0, startY = 0;

        for (int i=0; i<N; i++) {
            String line = sc.nextLine();
            for (int j=0; j<M; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }

        int result = bfs(startX, startY);
        System.out.println(result > 0 ? result : "TT");
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.offer(new int[]{x, y});

        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                if (visited[nx][ny] || map[nx][ny] == 'X') {
                    continue;
                }

                visited[nx][ny] = true;
                if (map[nx][ny] == 'P') {
                    count++;
                }
                queue.offer(new int[] {nx, ny});
            }
        }

        return count;
    }
}