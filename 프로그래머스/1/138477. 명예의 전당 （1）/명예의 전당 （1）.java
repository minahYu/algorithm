import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] top = new int[k];
        int min = 2001;
        int j = 0;
        
        for(int i=0; i<score.length; i++) {
            if(i<k) {
                top[i] = score[i];
                if(min > score[i])
                    min = score[i];
                answer[j] = min;
            } else {
                Arrays.sort(top);
                if(top[0] < score[i])
                    top[0] = score[i];
                Arrays.sort(top);
                answer[j] = top[0];
            }
            j++;
        }
        return answer;
    }
}