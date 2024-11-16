import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        int i = 0, j = N-1;
        int count = 0;
        while(i < j) {
            if(array[i] + array[j] == M) {
                count++;
                i++;
                j--;
            } else if(array[i] + array[j] < M) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(count);
    }
}
