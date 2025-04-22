import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Map<Integer, Integer> headcount = new HashMap<>();
			int[] nOrder = new int[N];
			for(int j=0; j<N; j++) {
				nOrder[j] = Integer.parseInt(st.nextToken());
				headcount.put(nOrder[j], headcount.getOrDefault(nOrder[j], 0) + 1);
			}
			
			Map<Integer, List<Integer>> teamScores = new HashMap<>();
			int j = 1;
			for(int teamNum : nOrder) {
				if(headcount.get(teamNum) == 6) {
					teamScores.putIfAbsent(teamNum, new ArrayList<>());
					teamScores.get(teamNum).add(j++);
				}	
			}
			
			List<Integer> keySet = new ArrayList<>(teamScores.keySet());
			for(int team : keySet) {
				List<Integer> scores = teamScores.get(team);
				scores.sort(Comparator.naturalOrder());
				
				int teamScore = 0;
				for(int k=0; k<4; k++) {
					teamScore += scores.get(k);
				}
				scores.add(teamScore);
			}
			
			
			keySet.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					int sum1 = teamScores.get(o1).get(6);
					int sum2 = teamScores.get(o2).get(6);
					
					if(sum1 == sum2) {
						return teamScores.get(o1).get(4).compareTo(teamScores.get(o2).get(4));
					}
					return Integer.compare(sum1, sum2);
				}
			});

			sb.append(keySet.get(0)).append("\n");
		}
		System.out.println(sb.toString());
	}
}
