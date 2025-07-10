import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int[][][] box;
    static boolean[][][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    
    static int M, N, H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int h=0; h<H; h++) {
            for (int n=0; n<N; n++) {
                st = new StringTokenizer(br.readLine());
                
                for (int m=0; m<M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    
                    if (box[h][n][m] == 1) {
                        queue.offer(new int[]{h, n, m});
                        visited[h][n][m] = true;
                    }
                }
            }
        }

        bfs();

        int answer = 0;
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    answer = Math.max(answer, box[h][n][m]);
                }
            }
        }

        System.out.println(answer - 1);
    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int z = position[0];
            int x = position[1];
            int y = position[2];

            for (int i=0; i<6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < N && ny < M && nz < H) {
                    if (!visited[nz][nx][ny] && box[nz][nx][ny] == 0) {
                        visited[nz][nx][ny] = true;
                        box[nz][nx][ny] = box[z][x][y] + 1;
                        queue.offer(new int[]{nz, nx, ny});
                    }
                }
            }
        }
    }
}
