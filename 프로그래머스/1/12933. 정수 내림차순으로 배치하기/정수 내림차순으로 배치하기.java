import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] ch = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(ch);
        sb.append(ch).reverse();

        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}