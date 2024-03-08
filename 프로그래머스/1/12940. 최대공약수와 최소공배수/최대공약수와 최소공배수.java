import java.lang.Math;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp = 0;
        int copyN = n, copyM = m;
        
        if(m%n == 0) {
            answer[0] = n;
            answer[1] = m;
        } else {
            while(m%n != 0) {
                temp = m%n;
                m = n;
                n = temp;
                System.out.println(n + " " + m);
            }
            // for(int i=(int)Math.sqrt(m*n); i>0; i--) {
            //     if(n%i == 0 && m%i == 0) {
            //         answer[0] = i;
            //         break;
            //     }
            // }
            answer[0] = n;
            answer[1] = (copyN/answer[0]) * (copyM/answer[0]) * answer[0];
        }
        return answer;
    }
}