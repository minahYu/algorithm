import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Map<String, String> map = new HashMap<>();
        
        for(String s1Word : s1) {
            map.put(s1Word, s1Word);
        }
        
        for(String s2Word : s2) {
            if(map.get(s2Word) != null) answer++;
        }
        
        
        return answer;
    }
}