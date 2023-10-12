class Solution {
    public int solution(int num) {
        int answer = 0;
        long lNum = (long)num;
        
        while(lNum != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }
        
            lNum = (lNum%2 == 0) ? (lNum/2) : (lNum*3 + 1);
            answer++;
        }
        
        return answer;
    }
}