import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;


class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> left = new HashSet<>();
        Map<Integer, Integer> right = new HashMap<>();
        for(int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }
        
        for(int i=0; i<topping.length; i++) {
            int t = topping[i];
            
            left.add(t);
            
            right.put(t, right.get(t) - 1);
            if(right.get(t) == 0) {
                right.remove(t);
            }
            
            if(left.size() == right.size()) {
                answer++;
            }    
        }
        
        return answer;
    }
}