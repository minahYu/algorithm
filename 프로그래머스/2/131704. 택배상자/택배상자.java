import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1;
        int idx = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        while(box <= order.length) {
            if(order[idx] == box) {
                answer++;
                idx++;
                box++;
            } else if(!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                answer++;
                idx++;
            } else {
                stack.push(box);
                box++;
            }
        }
        
        while(!stack.isEmpty() && stack.peek() == order[idx]) {
            stack.pop();
            answer++;
            idx++;
        }
        
        return answer;
    }
}