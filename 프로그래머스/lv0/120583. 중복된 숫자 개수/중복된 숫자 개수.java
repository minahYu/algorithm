import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int num : array) {
            answer = (n == num) ? answer + 1 : answer;
        }
        
        return answer;
    }
}