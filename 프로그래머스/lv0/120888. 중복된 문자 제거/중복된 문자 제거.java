import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> set = new LinkedHashSet<>();
        String strCheck;
        
        for(int i=0; i<my_string.length(); i++) {
            strCheck = my_string.charAt(i) + "";
            if(!set.contains(strCheck))
                set.add(strCheck);
        }
        
        Iterator<String> it = set.iterator();
        
        while(it.hasNext()) {
            answer += it.next();
        }
        
        return answer;
    }
}