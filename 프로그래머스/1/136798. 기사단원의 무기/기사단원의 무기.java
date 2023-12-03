class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int num = 0;
        
        for(int i=2; i<=number; i++) {
            num = 0;
            for(int j=1; j<=Math.sqrt(i); j++) {
                if(i == j*j)
                    num++;
                else if(i%j == 0) 
                    num += 2;
            }
            answer = num > limit ? answer+power : answer+num;
        }
        
        return answer;
    }
}