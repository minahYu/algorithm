import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
        
		List<String> list = new ArrayList<>();
		for(int i=0; i<S.length(); i++) {
			list.add(S.substring(i, S.length()));
		}
		Collections.sort(list);
        
		for(String str : list) {
			System.out.println(str);
		}
	}
}