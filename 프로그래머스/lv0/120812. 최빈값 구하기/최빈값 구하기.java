import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        if(array.length == 1) {
            answer = array[0];
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            
            for(int num : array) {
                int count = map.getOrDefault(num, 0) + 1;
                
                if(count > max) {
                    max = count;
                    answer = num;
                } else if(count == max) {
                    answer = -1;
                }
                map.put(num, count);
            }    
        }
        
        return answer;
    }
}