import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c='a'; c<='z'; c++) {
			map.put(c, -1);
		}
		
		for(char c : S.toCharArray()) {
			map.put(c, S.indexOf(c));
		}
		
		for(char c='a'; c<='z'; c++) {
			System.out.print(map.get(c) + " ");
		}
	}
}
