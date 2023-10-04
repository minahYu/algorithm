import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = (int)Math.sqrt(n);
        answer = (n == num*num) ? 1 : 2;
        
        return answer;
    }
}