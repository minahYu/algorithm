class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n+1];
    
        num[0] = 0;
        num[1] = 1;
        
        for(int i=2; i<=n; i++) {
            num[i] = (num[i-1] + num[i-2]) % 1234567;
        }
        answer = num[n];
        
        return answer;
    }
}