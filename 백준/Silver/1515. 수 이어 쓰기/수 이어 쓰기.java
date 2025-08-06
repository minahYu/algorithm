import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] arr = str.toCharArray();
		boolean[] visited = new boolean[3001];

		int num = 1, idx = 0;
		int last = 0;	
		while(idx < arr.length) {
			String tmp = String.valueOf(num);
			for(char part : tmp.toCharArray()) {
				if(idx >= arr.length) {
					break;
				}
				
				if(!visited[idx] && part == arr[idx]) {
					visited[idx] = true;
					last = Integer.valueOf(num);
					idx++;
				}
			}
			num++;
		}
		
		System.out.println(last);
	}
}
