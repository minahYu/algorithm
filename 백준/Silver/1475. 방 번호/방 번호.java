import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNum = sc.next();

        int[] count = new int[10];

        for (int i = 0; i < roomNum.length(); i++) {
            int digit = roomNum.charAt(i) - '0';
            count[digit]++;
        }

        int sixNine = count[6] + count[9];
        count[6] = count[9] = (sixNine + 1) / 2;

        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);
    }
}
