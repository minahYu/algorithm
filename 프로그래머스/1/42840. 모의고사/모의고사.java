import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] count = new int[3];
        int[] p1 = { 1, 2, 3, 4, 5 };
        int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        for(int i=0; i<answers.length; i++) {
            if(p1[i%p1.length] == answers[i])
                count[0]++;
            if(p2[i%p2.length] == answers[i])
                count[1]++;
            if(p3[i%p3.length] == answers[i])
                count[2]++;
        }
        
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<count.length; i++) {
            if(max == count[i])
                list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}