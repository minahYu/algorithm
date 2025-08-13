import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class KeySet {
	char ch;
	char[] chArr;
	int idx;
	
	KeySet(char ch, char[] chArr, int idx) {
		this.ch = ch;
		this.chArr = chArr;
		this.idx = idx;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String key = br.readLine();
		String cipher = br.readLine();
		
		int N = key.length();
		int rows = cipher.length()/N;
		
		List<KeySet> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			list.add(new KeySet(key.charAt(i), new char[rows], i));
		}
		
		Collections.sort(list, new Comparator<KeySet>() {
			@Override
			public int compare(KeySet o1, KeySet o2) {
				if(o1.ch == o2.ch) {
					return o1.idx - o2.idx;
				}
				return o1.ch - o2.ch;
			}
		});
		
		int idx = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<rows; j++) {
				list.get(i).chArr[j] = cipher.charAt(idx++);
			}
		}
		
		Collections.sort(list, new Comparator<KeySet>() {
			@Override
			public int compare(KeySet o1, KeySet o2) {
				return o1.idx - o2.idx;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<N; j++) {
				sb.append(list.get(j).chArr[i]);
			}
		}
		System.out.println(sb.toString());
	}
}