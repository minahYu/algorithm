import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(arr);
        if(divisor == 1)
            return arr;
        
        for(int num : arr) {
            if(num % divisor == 0) 
                list.add(num);
        }
        
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            
            for(int i=0; i<answer.length; i++)
                answer[i] = list.get(i);
        }
        
        return answer;
    }
}