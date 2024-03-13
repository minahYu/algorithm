import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            if(!map.containsKey(sArr[i]))
                answer[i] = -1;
            else
                answer[i] = i-map.get(sArr[i]);
            map.put(sArr[i], i);
        }
        
        
        
        
        

        
        return answer;
    }
}