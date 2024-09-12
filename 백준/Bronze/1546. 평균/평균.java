import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double sum = 0;
		double[] scores = new double[N];
		for(int i=0; i<N; i++) {
			scores[i] = sc.nextInt();
		}
		Arrays.sort(scores);
		
		double maxScore = scores[N-1];
		for(int i=0; i<N; i++) {
			double newScore = scores[i] / maxScore * 100;
			sum += newScore;
		}
		System.out.println(sum / N);
	}
}
