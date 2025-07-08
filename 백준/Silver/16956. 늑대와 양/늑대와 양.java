import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static char[][] map;
    static int R, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();

        map = new char[R][C];
        for (int i=0; i<R; i++) {
            String line = sc.nextLine();
            map[i] = line.toCharArray();
        }

        if (!isValid()) {
            System.out.println(0);
        } else {
            System.out.println(1);
            for (int i=0; i<R; i++) {
                System.out.println(new String(map[i]));
            }
        }
    }

    static boolean isValid() {
        for (int x=0; x<R; x++) {
            for (int y=0; y<C; y++) {
                if (map[x][y] == 'W') {
                    for (int i=0; i<4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                            continue;
                        }
                            
                        if (map[nx][ny] == 'S') {
                            return false;
                        }
                        if (map[nx][ny] == '.') {
                            map[nx][ny] = 'D';
                        }
                    }
                }
            }
        }
        return true;
    }
}
