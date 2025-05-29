import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		Map<Integer, Integer> b = new HashMap<>();
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
			B[i] = sc.nextInt();
			b.put(i, B[i]);
		}
		
		List<Integer> keySet = new ArrayList<>(b.keySet());
		keySet.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return b.get(o1).compareTo(b.get(o2));
			}
		});
		
		Arrays.sort(A, Collections.reverseOrder());
		int i = 0;
		
		int[] sortIdx = new int[N];
		for(int num : keySet) {
			sortIdx[num] = A[i];
			i++;
		}
		
		int S = 0;
		for(int j=0; j<N; j++) {
			S += (sortIdx[j] * B[j]);
		}
		
		System.out.println(S);
	}
}
