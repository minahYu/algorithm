import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    private static int k;
    private static char[] signs;
    private static boolean[] used = new boolean[10];
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());

        signs = new char[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<k; i++) {
            signs[i] = st.nextToken().charAt(0);
        }

        dfs(0, "");

        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }

    private static void dfs(int depth, String num) {
        if (depth == k + 1) {
            list.add(num);
            return;
        }

        for (int i=0; i<=9; i++) {
            if (used[i]) continue;

            if (depth == 0 || check(num.charAt(depth-1) - '0', i, signs[depth-1])) {
                used[i] = true;
                dfs(depth+1, num+i);
                used[i] = false;
            }
        }
    }

    private static boolean check(int a, int b, char ch) {
        if (ch == '<') {
            return a < b;
        } else {
            return a > b;
        }
    }
}
