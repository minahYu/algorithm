import java.util.Scanner;

public class Main {
    static boolean[][] visited = new boolean[101][101];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    
    static int dir = 0;
    static int x = 50, y = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String move = sc.next();

        visited[x][y] = true;

        for (int i=0; i<n; i++) {
            char ch = move.charAt(i);

            if (ch == 'R') {
                dir = (dir + 1) % 4;
            } else if (ch == 'L') {
                dir = (dir + 3) % 4;
            } else if (ch == 'F') {
                x += dx[dir];
                y += dy[dir];
                visited[x][y] = true;
            }
        }

        int minX = 101, maxX = 0;
        int minY = 101, maxY = 0;
        for (int i=0; i<=100; i++) {
            for (int j=0; j<=100; j++) {
                if (visited[i][j]) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        for (int i=minX; i<=maxX; i++) {
            for (int j=minY; j<=maxY; j++) {
                System.out.print(visited[i][j] ? "." : "#");
            }
            System.out.println();
        }
    }
}
