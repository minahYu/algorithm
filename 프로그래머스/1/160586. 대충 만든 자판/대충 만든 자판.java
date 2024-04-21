import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++) {
            for(char alpha : keymap[i].toCharArray()) {
                if((map.containsKey(alpha) 
                    && (map.get(alpha) <= keymap[i].indexOf(alpha))))
                    continue;
                map.put(alpha, keymap[i].indexOf(alpha)+1);
            }
        }
             System.out.println(map );          
        for(int i=0; i<targets.length; i++) {
            for(char alpha : targets[i].toCharArray()) {
                System.out.println(alpha );
                if(!map.containsKey(alpha)) {
                    answer[i] = -1;
                    break;
                }
                else
                    answer[i] += map.get(alpha);  
            }
        }
        
        return answer;
    }
}