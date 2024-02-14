import java.util.*;

class Solution {
    public int[] solution(long n) {
        String nStr = String.valueOf(n);
        String[] nArr = nStr.split("");
        int[] answer = new int[nArr.length];
        
        for(int i=0; i<nArr.length; i++) {
            answer[i] = Integer.parseInt(nArr[nArr.length-i-1]);
        }
        
        return answer;
    }
}