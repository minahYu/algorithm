import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[][] map = new int[N][M];
        for (int i=0; i<N; i++) {
            String line = sc.nextLine();
            for (int j=0; j<M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int maxLen = 1;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                for (int len=1; i+len < N && j+len < M; len++) {
                    int a = map[i][j];
                    int b = map[i][j + len];
                    int c = map[i + len][j];
                    int d = map[i + len][j + len];

                    if (a == b && a == c && a == d) {
                        int side = len + 1;
                        maxLen = Math.max(maxLen, side);
                    }
                }
            }
        }
        System.out.println(maxLen * maxLen);
    }
}
