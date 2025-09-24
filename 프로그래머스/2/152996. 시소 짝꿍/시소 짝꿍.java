import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<weights.length; i++) {
            map.put(weights[i], map.getOrDefault(weights[i], 0) + 1);
        }
        
        for(int weight : map.values()) {
            if(weight >= 2) answer += (long)weight * (weight - 1) / 2;
        }
        
        List<Integer> keyset = new ArrayList<>(map.keySet());
        Collections.sort(keyset);
        
        for(int weight : keyset) {
            int mul = weight * 2;
            if(map.containsKey(mul)) answer += (long)map.get(weight) * map.get(mul);
            
            if((3*weight) % 2 == 0) {
                mul = weight * 3 / 2;
                if(map.containsKey(mul)) answer += (long)map.get(weight) * map.get(mul);
            }
            
            if((4*weight) % 3 == 0) {
                mul = weight * 4 / 3;
                if(map.containsKey(mul)) answer += (long)map.get(weight) * map.get(mul);
            }
            
        }
        
        return answer;
    }
}