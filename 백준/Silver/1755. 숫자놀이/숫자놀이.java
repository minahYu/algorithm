import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] englishNums = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		String[] strNums = new String[N-M+1];
		for(int i=M; i<=N; i++) {
			int index = i;
			StringBuilder sb = new StringBuilder();
			while(index >= 10) {
				sb.insert(0, englishNums[index%10]);
				index /= 10;
			}			
			
			sb.insert(0,englishNums[index]);
			
			strNums[i-M] = sb.toString();
		}
		
		Arrays.sort(strNums);
		
		StringBuilder answer = new StringBuilder();
		for(int i=0; i<strNums.length; i++) {
			for(int j=0; j<englishNums.length; j++) {
				strNums[i] = strNums[i].replace(englishNums[j], String.valueOf(j));
			}
			answer.append(strNums[i]).append(" ");
			if(i != 0 && (i+1)%10 == 0) {
				answer.deleteCharAt(answer.length() - 1);
				answer.append("\n");
			}
		}
		System.out.println(answer.toString());
	}
}
