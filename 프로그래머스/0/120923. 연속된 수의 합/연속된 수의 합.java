class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
    
        int left = 1;
        int right = num;
        while(total != sum) {
            if(sum < total) {
                sum += (++right);
                sum -= (left++);
            } else if(sum > total) {
                sum += (--left);
                sum -= (right--);
            }
        }
        
        int index = 0;
        for(int n=left; n<=right; n++) {
            answer[index++] = n;
        }
        
        return answer;
    }
}