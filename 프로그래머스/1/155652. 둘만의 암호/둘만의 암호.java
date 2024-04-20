import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        
        for(int i=0; i<26; i++)
            list.add((char)('a' + ('a' + i - 'a') % 26));
        
        for(char skipOne : skip.toCharArray())
            list.remove(Character.valueOf(skipOne));
        
        for(char sOne : s.toCharArray()) {
            int chIdx = list.indexOf(sOne) + index;
            answer += list.get(chIdx % list.size());
        }   
        
        return answer;
    }
}