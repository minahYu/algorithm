import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nStr = String.valueOf(n);
        char[] charArr = nStr.toCharArray();
        
        Arrays.sort(charArr);
        nStr = "";
        
        for(int i=0; i<charArr.length; i++) {
            nStr += String.valueOf(charArr[charArr.length-1-i]);
        }
        answer = Long.parseLong(nStr);
        
        return answer;
    }
}