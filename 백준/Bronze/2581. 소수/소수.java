import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] isPrime = new boolean[N+1];
		
		int sum = 0;
		int min = 0;
		
		for(int i=2; i<=N; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i<=Math.sqrt(N); i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=N; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(isPrime[i]) {
				if(sum == 0) {
					min = i;
				}
				sum += (i);
			}
		}
		
		if(sum == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(sum).append("\n");
			sb.append(min);
		}
		System.out.println(sb.toString());
	}
}
