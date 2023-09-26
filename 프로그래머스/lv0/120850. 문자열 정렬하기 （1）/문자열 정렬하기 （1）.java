import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        char check;
        
        for(int i=0; i<my_string.length(); i++) {
            check = my_string.charAt(i);
            if(Character.isDigit(check)) {
                list.add(check - '0');
            }
        }
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}