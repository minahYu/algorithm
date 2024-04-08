import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] inStage = new int[N];
        int totalPerson = stages.length;
        Map<Integer, Double> percent = new HashMap<>();
        
        Arrays.sort(stages);
        for(int i=0; i<stages.length; i++) {
            if(stages[i] <= N)
                inStage[stages[i]-1]++;
        }
        
        for(int i=0; i<inStage.length; i++) {
            double fail = (double)inStage[i] / totalPerson;
            if(totalPerson == 0)
                fail = 0; 
            percent.put(i+1, fail);
            totalPerson -= inStage[i];
        }
        
        List<Integer> list = new ArrayList<>(percent.keySet());
        list.sort((o1, o2) -> percent.get(o2).compareTo(percent.get(o1)));
        
        int idx = 0;
        for(int st : list)
            answer[idx++] = st;
        
        return answer;
    }
}