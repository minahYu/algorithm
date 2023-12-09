import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[completion.length];
        HashMap<Integer, String> map = new HashMap<>();
        
        for(int i=0; i<completion.length; i++) {
            map.put(i, completion[i]);
        }
        
        for(int i=0; i<completion.length; i++) {
            if(!map.get(i).equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}