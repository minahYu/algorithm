class Solution {
    public int solution(int num) {
        long calc = num;
        int answer = 0;
        
        while(calc > 1) {
            if(answer >= 500) {
                answer = -1;
                break;
            }
            answer++;
            if(calc%2 == 0) {
                calc /= 2;
            } else {
                calc *= 3;
                calc++;
            } 
        }
        
        return answer;
    }
}