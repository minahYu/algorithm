import java.util.Stack;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<>();
        
        Arrays.fill(answer, -1);
        
        for(int i=0; i<numbers.length; i++) {
            while(!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }
            
            stack.push(i);
        }
        
        return answer;
    }
}