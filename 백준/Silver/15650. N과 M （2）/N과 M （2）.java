import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int[] arr;
    static boolean[] haveNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        haveNum = new boolean[n+1];

        recursive(1, 0);
        System.out.println(sb);
    }

    static void recursive(int start, int depth) {
        if(depth == m) {
            for(int i=0; i<depth-1; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append(arr[depth-1]).append("\n");
            return;
        }
        for(int i=start; i<=n; i++) {
            if(!haveNum[i]) {
                arr[depth] = i;
                haveNum[i] = true;
                recursive(i, depth+1);
            }
        }
        Arrays.fill(haveNum, false);
    }
}