import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String person : participant)
            map.put(person, map.getOrDefault(person, 0)+1);
        
        for(String finisher : completion)
            if(map.get(finisher) != 0)
                map.put(finisher, map.get(finisher)-1);
        
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            if(map.get(name) != 0) {
                answer = name;
                break;
            }     
        }
        return answer;
    }
}