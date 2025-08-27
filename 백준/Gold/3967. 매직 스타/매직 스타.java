import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	private static int[] val;
	private static boolean[] used;
	
	private static final int[][] LINES = {
		{0, 2, 5, 7},
		{0, 3, 6, 10},
		{1, 2, 3, 4},
		{1, 5, 8, 11},
		{4, 6, 9, 11},
		{7, 8, 9, 10}
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		val = new int[12];
		used = new boolean[13];
		
		StringBuilder[] lines = new StringBuilder[5];
		
		int idx = 0;
		for(int i=0; i<5; i++) {
			String line = br.readLine();
			lines[i] = new StringBuilder(line);
			char[] chArr = line.toCharArray();
			
			for(int j=0; j<chArr.length; j++) {
				if(chArr[j] != '.') {
					if(chArr[j] == 'x') {
						val[idx++] = 0;
					} else {
						val[idx] = chArr[j] - 'A' + 1;
						used[val[idx]] = true;
						idx++;
					}
				}
			}	
		}
		
		backtrack(0);
			
		idx = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<lines[i].length(); j++) {
				if(lines[i].charAt(j) == '.') continue;
				
				char ch = (char)(val[idx] + 'A' - 1);
				lines[i].setCharAt(j, ch);
				idx++;
			}
			sb.append(lines[i]).append('\n');
		}
		System.out.println(sb.toString());
	}
	
	private static boolean backtrack(int idx) {
		if(idx == 12) return true;
		if(val[idx] != 0) return backtrack(idx+1);
		
		for(int i=1; i<=12; i++) {
			if(used[i]) continue;
			val[idx] = i;
			
			if(isValidPlacement(idx)) {
				used[i] = true;
				if(backtrack(idx+1)) return true;
				used[i] = false;
			}
			val[idx] = 0;
		}
		
		return false;
	}
	
	private static boolean isValidPlacement(int idx) {
		for(int[] line : LINES) {
			boolean contains = false;
			int sum = 0, zeroCount = 0;
			
			for(int n : line) {
				if(n == idx) contains = true;
				
				if(val[n] == 0) {
					zeroCount++;
				} else {
					sum += val[n];
				}
			}
			
			if(!contains) continue;
			if(sum > 26) return false;
			if(zeroCount == 0 && sum != 26) return false;
		}
		
		return true;
	}
}
