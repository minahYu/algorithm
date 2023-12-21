import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap<>();
        int count = 0;
        String sTemp = s;
        
        map.put("{", "}");
        map.put("[", "]");
        map.put("(", ")");
        
        while(count++ != s.length()) {
            for(int i=0; i<s.length(); i++) {
                if(stack.isEmpty()) {
                    stack.push(String.valueOf(s.charAt(i)));
                } else {
                    String top = stack.peek();
                    
                   if(String.valueOf(s.charAt(i)).equals(map.get(top)))
                        stack.pop();
                   else
                        stack.push(String.valueOf(s.charAt(i)));
                }
            }
            if(stack.isEmpty())
                answer++;
            
            sTemp = s;
            s = "";
            for(int i=1; i<sTemp.length(); i++) {
                s += String.valueOf(sTemp.charAt(i));
            }
            s += String.valueOf(sTemp.charAt(0));
            
            stack.clear();
        }

        return answer;
    }
}