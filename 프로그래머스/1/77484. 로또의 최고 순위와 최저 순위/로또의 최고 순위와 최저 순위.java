class Solution {
    public int[] solution(int[] lottos, int[] win_nums) { 
        int[] answer = { 1, 6 };
        int sameCount = 0;
        int zeroCount = 0;
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j])
                    sameCount++;
            }
        }
        
        answer[1] = 7-sameCount;
        answer[0] = answer[1]-zeroCount;
        
        if(answer[0] > 6)
            answer[0] = 6;
        if(answer[1] > 6)
            answer[1] = 6;
        
        return answer;
    }
}