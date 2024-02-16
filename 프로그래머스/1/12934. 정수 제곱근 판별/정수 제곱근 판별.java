import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;
        double nSqrt = Math.sqrt(n);
        
        if(nSqrt%1 == 0)
            answer = (long)(Math.pow(nSqrt+1, 2));
        
        return answer;
    }
}