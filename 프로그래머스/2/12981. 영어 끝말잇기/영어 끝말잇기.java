import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Integer> map = new HashMap<>();
        String beforeWord = words[0];
        
        map.put(words[0], 1);
        for(int i=1; i<words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
            
            if((beforeWord.charAt(beforeWord.length()-1) != words[i].charAt(0)) || (map.get(words[i]) > 1)) {
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
            
            beforeWord = words[i];
        }
        
        return answer;
    }
}