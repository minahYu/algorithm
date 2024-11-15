import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        int[] remainDays = new int[progresses.length];
        
        for(int i=progresses.length - 1; i>= 0; i--) {
            remainDays[i] = (100 - progresses[i]) / speeds[i];
            
            if((100 - progresses[i]) % speeds[i] > 0) {
                remainDays[i]++;
            }
            stack.push(remainDays[i]);
        }
        
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()) {
            int remainDay = stack.pop();
            count = 1;
            
            while(!stack.isEmpty() && remainDay >= stack.peek()) {
                count++;
                stack.pop();
            }
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}