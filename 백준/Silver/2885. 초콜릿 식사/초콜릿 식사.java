import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		int n = 0;
		int size = 0;
		while(K > size) {
			size = (int)Math.pow(2, n++);
		}
		
		int count = 0;
		int min = size/2;
		int currentPieces = size;
		while(currentPieces != K) {
			if(currentPieces < K) {
				currentPieces += min;
			} else if(currentPieces > K) {
				currentPieces -= min;
			}
			min /= 2;
			count++;
		}
		
		System.out.println(size + " " + count);
	}
}
