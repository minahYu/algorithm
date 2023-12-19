import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] count = new int[tangerine[tangerine.length-1]];
        
        for(int i=0; i<tangerine.length; i++)
            count[tangerine[i]-1]++;
        
        Arrays.sort(count);
        
        for(int i=count.length-1; i>=0; i--) {
            if(k <= 0) 
                break;
            k -= count[i];
            answer++;
        }
        
        return answer;
    }
}