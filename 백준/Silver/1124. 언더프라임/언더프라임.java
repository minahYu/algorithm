import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		boolean[] isPrime = new boolean[100001];
		for(int i=2; i<=100000; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<=100000; i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=100000; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		int count = 0;
		for(int i=A; i<=B; i++) {
			int n = i;
			int cnt = 0;
		
			for(int j=2; j<=n; j++) {
				while(n%j == 0) {
					cnt++;
					n /= j;
				}
			}
			
			if(n > 1) {
				cnt++;
			}
			
			if(isPrime[cnt]) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}