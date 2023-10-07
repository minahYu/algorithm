import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), count);      
        }
        answer = map.get('p') == map.get('y') ? true : false;

        return answer;
    }
}