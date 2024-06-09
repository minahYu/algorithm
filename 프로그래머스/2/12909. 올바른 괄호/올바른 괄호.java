import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        char[] chArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        if(chArr.length%2 == 0) {
            answer = true;
            stack.push(chArr[0]);
            for(int i=1; i<chArr.length; i++) {
                if(!stack.isEmpty()) {
                    if(stack.peek() == '(' && chArr[i] == ')')
                        stack.pop();
                    else
                        stack.push(chArr[i]);
                } else {
                    stack.push(chArr[i]);
                }
            }
            if(!stack.isEmpty())
                answer = false;
        }

        return answer;
    }
}