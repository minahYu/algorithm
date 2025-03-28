import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Set<String>> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1], new HashSet<>());
        }
        
        for(int i=0; i<clothes.length; i++) {
            map.get(clothes[i][1]).add(clothes[i][0]);
        }
        
        for(String key : map.keySet()) {
            answer *= (map.get(key).size() + 1);
        }
        
        return --answer;
    }
}