import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int N;
    static int max = 0;
    
    static int[] nums;
    static boolean[] visited;
    static int[] perm;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        visited = new boolean[N];
        perm = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(max);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            int sum = 0;
            for (int i=0; i<N-1; i++) {
                sum += Math.abs(perm[i] - perm[i+1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i=0; i<N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                perm[depth] = nums[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}