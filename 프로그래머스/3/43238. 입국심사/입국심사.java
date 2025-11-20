class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        long maxTime = 0;
        for(int time : times) {
            maxTime = Math.max(maxTime, time);
        }
        
        long low = 1;
        long high = (long)n * maxTime;
        
        while(low <= high) {
            long mid = (low + high) / 2;
            long peopleCount = 0;
            
            for(int time : times) {
                peopleCount += mid / time;
            }
            
            if(peopleCount >= n) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return answer;
    }
}