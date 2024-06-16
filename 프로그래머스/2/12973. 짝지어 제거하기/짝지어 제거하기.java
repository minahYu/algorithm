import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        
        stack.add(charArr[0]);
        for(int i=1; i<s.length(); i++) {
            if(!stack.isEmpty()) {
                if(stack.peek() == charArr[i]) {
                    stack.pop();
                } else {
                    stack.add(charArr[i]);
                }
            } else {
                stack.add(charArr[i]);
            }
        }
        if(stack.isEmpty())
            answer = 1;

        return answer;
    }
}