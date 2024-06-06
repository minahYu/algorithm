class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;
        
        int start_index = 1;
        int end_index = 1;
        
        while(end_index != n) {
            if(sum < n) {
                end_index++;
                sum += end_index;
            } else if(sum > n) {
                sum -= start_index;
                start_index++;
            } else {
                answer++;
                end_index++;
                sum += end_index;
            }
        }
        
        return answer;
    }
}