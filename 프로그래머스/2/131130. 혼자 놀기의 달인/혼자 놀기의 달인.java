import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    private static boolean[] visited;
    
    public int solution(int[] cards) {
        int answer = 1;
        
        visited = new boolean[cards.length];
        List<Integer> groupSize = new ArrayList<>();
        
        for(int i=0; i<cards.length; i++) {
            if(!visited[i]) {
                groupSize.add(dfs(i, 0, cards));
            }
        }
        
        if(groupSize.size() == 1) {
            answer = 0;
        } else {
            Collections.sort(groupSize, Collections.reverseOrder());
            answer = groupSize.get(0) * groupSize.get(1);
        } 
        
        return answer;
    }
    
    private int dfs(int cur, int count, int[] cards) {   
        visited[cur] = true;
        count++;
        
        int next = cards[cur] - 1;
        
        if(!visited[next]) {
             return dfs(next, count, cards);
        }
        
        return count;        
    }
}