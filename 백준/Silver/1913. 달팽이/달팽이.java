import java.util.Scanner;

public class Main {
	static int N = 0;
	static int numOfOne = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		numOfOne = sc.nextInt();
		
		int num = N*N;
		int limit = N;
		int y=0, x=0;
		int[][] snail = new int[N][N];

		while(num > 0) {
			for(int i=y; i<y+limit; i++) {
				snail[i][x] = num--;
			}
			y += limit - 1;
			
			for(int i=x+1; i<x+limit; i++) {
				snail[y][i] = num--;
			}
			x += limit - 1;
			
			for(int i=y-1; i>=y-(limit-1); i--) {
				snail[i][x] = num--;
	
			}
			y -= limit - 1;
			
			for(int i=x-1; i>x-(limit-1); i--) {
				snail[y][i] = num--;
	
			}
			x -= limit - 1;
			
			limit -= 2;
			x++;
			y++;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(snail[i][j] + " ");
				if(snail[i][j] == numOfOne) {
					sb.append(i+1).append(" ").append(j+1);
				}
			}
			System.out.println();
		}
		System.out.println(sb.toString());
	}
}
