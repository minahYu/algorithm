import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String solution(String number, int k) {
        Deque<Character> deque = new ArrayDeque<>();
        
        for(char ch : number.toCharArray()) {
            while(!deque.isEmpty() && k > 0 && deque.peekLast() < ch) {
                deque.pollLast();
                k--;
            }
            deque.addLast(ch);
        }
        
        while(k-- > 0) {
            deque.pollLast();
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch : deque) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}