import java.util.Scanner;

public class Main {
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    
    private static int R, C, K;
    private static char[][] map;
    private static boolean[][] visited;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i=0; i<R; i++) {
            String line = sc.nextLine();
            for (int j=0; j<C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        visited[R-1][0] = true;
        dfs(R-1, 0, 1);

        System.out.println(count);
    }
    
    private static void dfs(int x, int y, int dist) {
        if (x == 0 && y == C-1) {
            if (dist == K) {
                count++;
            }
            return;
        }

        for (int d=0; d<4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                continue;
            }
            if (visited[nx][ny] || map[nx][ny] == 'T') {
                continue;
            }

            visited[nx][ny] = true;
            dfs(nx, ny, dist+1);
            visited[nx][ny] = false;
        }
    }
}
