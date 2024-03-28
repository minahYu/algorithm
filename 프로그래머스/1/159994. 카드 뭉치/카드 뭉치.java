import java.util.Stack;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Stack<String> cards1Stack = new Stack<>();
        Stack<String> cards2Stack = new Stack<>();
        int idx = 0;
        
        for(int i=cards1.length-1; i>=0; i--)
            cards1Stack.add(cards1[i]);
        for(int i=cards2.length-1; i>=0; i--) 
            cards2Stack.add(cards2[i]);
        
        while(idx < goal.length) {
            if(!cards1Stack.isEmpty() 
               && cards1Stack.peek().equals(goal[idx])) {
                cards1Stack.pop();
                idx++;
            } else if(!cards2Stack.isEmpty() 
                      && cards2Stack.peek().equals(goal[idx])) {
                cards2Stack.pop();
                idx++;
            } else {
                answer = "No";
                break;
            } 
        }
        return answer;
    }
}