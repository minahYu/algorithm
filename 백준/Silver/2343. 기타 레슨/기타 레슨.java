import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        int idx = 0;
        int maxLen = 0;
        long sum = 0L;

        st = new StringTokenizer(br.readLine());
        while (idx<N) {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int x = Integer.parseInt(st.nextToken());
            a[idx++] = x;
            sum += x;
            if (x > maxLen) {
                maxLen = x;
            }
        }

        long left = maxLen;
        long right = sum;
        while (left < right) {
            long mid = (left + right) / 2;
            if (neededDiscs(a, mid) <= M) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }

    private static int neededDiscs(int[] a, long cap) {
        int discs = 1;
        long cur = 0L;
        for (int len : a) {
            if (cur + len <= cap) {
                cur += len;
            } else {
                discs++;
                cur = len;
            }
        }
        return discs;
    }
}
