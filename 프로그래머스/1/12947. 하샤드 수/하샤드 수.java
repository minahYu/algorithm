class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0, xCopy = x;
        
        while(x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        if(xCopy%sum != 0)
            answer = false;
        
        return answer;
    }
}