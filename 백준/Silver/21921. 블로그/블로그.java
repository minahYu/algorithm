import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] visitorNums = new int[N];
        for (int i = 0; i < N; i++) {
            visitorNums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += visitorNums[i];
        }

        int max = sum;
        int count = 1;
        for (int i = X; i < N; i++) {
            sum = sum - visitorNums[i - X] + visitorNums[i];

            if (sum > max) {
                max = sum;
                count = 1;
            } else if (sum == max) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
