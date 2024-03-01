import java.lang.Math;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        
        for(int j=left; j<=right; j++) {
            cnt = 0;
            for(int i=1; i<=Math.sqrt(j); i++) {
                if(j%i == 0) 
                    cnt = i*i == j ? cnt+1 : cnt+2;
            }
            answer = cnt%2 == 0 ? answer+j : answer-j;
        }
        return answer;
    }
}