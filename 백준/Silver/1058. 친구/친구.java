import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        char[][] g = new char[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            g[i] = s.toCharArray();
        }

        int answer = 0;
        for (int i=0; i<N; i++) {
            boolean[] twoFriend = new boolean[N];

            for (int j=0; j<N; j++) {
                if (i == j) {
                    continue;
                }
                if (g[i][j] == 'Y') {
                    twoFriend[j] = true;
                    continue;
                }

                for (int k=0; k<N; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (g[i][k] == 'Y' && g[k][j] == 'Y') {
                        twoFriend[j] = true;
                        break;
                    }
                }
            }

            int cnt = 0;
            for (boolean b : twoFriend) {
                if(b) {
                    cnt++;
                }
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
