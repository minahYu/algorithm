class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int start = 0, end = 0;
        int sum = sequence[start];
        int len = Integer.MAX_VALUE;
        int n = sequence.length;
        
        while(end < n) {
            if(sum < k) {
                if(end+1 >= n) break;
                end++;
                sum += sequence[end];
            } else if(sum > k) { 
                sum -= sequence[start];
                start++;
                
                if (start > end && start < n) {
                    end = start;
                    sum = sequence[start];
                }
            } else {
                int curLen = end - start + 1;
                if(len > curLen || (curLen == len && start < answer[0])) {
                    len = curLen;
                    answer[0] = start;
                    answer[1] = end;
                }
                if(end+1 >= n) break;
                end++;
                sum += sequence[end];
            }    
        }
        
        return answer;
    }
}