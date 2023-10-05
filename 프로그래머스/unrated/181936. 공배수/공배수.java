class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(n%m == 0) {
            answer = number % n == 0 ? 1 : 0;
        } else {
            answer = number % (n*m) == 0 ? 1 : 0;
        }
        
        
        return answer;
    }
}