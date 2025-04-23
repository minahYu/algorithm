import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] line = new int[N];
		for(int num=1; num<=N; num++) {
			int left = sc.nextInt();
			int emptyCount = 0;
		
			for(int i=0; i<N; i++) {
				if(line[i] == 0) {
					if(emptyCount == left) {
						line[i] = num;
						break;
					}
					emptyCount++;
				}				
			}
		}
		
		for(int i=0; i<line.length; i++) {
			System.out.print(line[i] + " ");
		}
	}
}
