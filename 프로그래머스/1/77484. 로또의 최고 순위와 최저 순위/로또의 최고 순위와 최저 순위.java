class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int unknown = 0;
        
        for(int i=0; i<win_nums.length; i++) {
            if (lottos[i] == 0) {
                unknown++;
                continue;
            }
                    
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j])
                    cnt++;
            }
        }
        
        if(cnt >=2 && cnt <= 6) {
            answer[1] = 7-cnt;
        } else {
            answer[1] = 6;
        }
        
        if(cnt+unknown >=2 && cnt+unknown <= 6) {
            answer[0] = 7-(cnt+unknown);
        } else {
            answer[0] = 6;
        }
        
        return answer;
    }
}