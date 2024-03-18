class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int take = 0;
        
        while(n >= a && n >= 2) {
            take = n / a * b;
            answer += take;
            n = take + n % a;
        }
        return answer;
    }
}