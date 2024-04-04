class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] ansArr = new int[number];
        
        for(int i=0; i<number; i++) { 
            for(int j=1; j<=(int)Math.sqrt(i+1); j++) {
                if((i+1) % j == 0) {
                    ansArr[i]++;
                    if(j != (i+1)/j)
                        ansArr[i]++;
                }
            }
        }
        
        for(int i=0; i<number; i++) { 
            if(ansArr[i] > limit)
                answer += power;
            else
                answer += ansArr[i];
        }
        return answer;
    }
}