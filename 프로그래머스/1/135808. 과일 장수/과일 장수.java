import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int remains = score.length;
        
        Arrays.sort(score);
        while(remains >= m) {
            remains -= m;
            answer += score[remains] * m;
        }
        
        return answer;
    }
}