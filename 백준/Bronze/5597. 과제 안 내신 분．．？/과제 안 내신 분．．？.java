import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1; i<=30; i++) {
			list.add(i);
		}
		
		int size = list.size();
		for(int i=0; i<size-2; i++) {
			list.remove(Integer.valueOf(br.readLine()));
		}

		Collections.sort(list);
		for(int student : list) {
			System.out.println(student);
		}		
	}
}
