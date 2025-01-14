import java.lang.Math;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        for(int i=0; i<array.length; i++) {
            answer[0] = Math.max(array[i], answer[0]);
            
            if(answer[0] == array[i]) {
                answer[1] = i;
            }
        }
        
        return answer;
    }
}