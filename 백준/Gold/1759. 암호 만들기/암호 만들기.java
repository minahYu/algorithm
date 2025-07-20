import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    private static int L, C;
    private static char[] chars;
    private static char[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        chars = new char[C];
        result = new char[L];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<C; i++) {
            chars[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(chars);
        dfs(0, 0);
    }

    private static void dfs(int depth, int start) {
        if (depth == L) {
            if (isValid(result)) {
                System.out.println(new String(result));
            }
            return;
        }

        for (int i=start; i<C; i++) {
            result[depth] = chars[i];
            dfs(depth+1, i+1);
        }
    }

    private static boolean isValid(char[] arr) {
        int vowels = 0;
        int consonants = 0;
        
        for (char c : arr) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else consonants++;
        }
        
        return vowels >= 1 && consonants >= 2;
    }
}