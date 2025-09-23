class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        
        long useless = w + h - gcd(w, h);
        answer = ((long)w) * h - useless;
        
        return answer;
    }
    
    private static int gcd(int a, int b) {
        while(b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}