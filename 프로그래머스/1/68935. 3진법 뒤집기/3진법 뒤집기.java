class Solution {
    public int solution(int n) {
        int answer = 0;
        String trit = "";
        
        while(n > 0) {
            trit = (n % 3) + trit;
            n /= 3;
        }
        char[] chArr = trit.toCharArray();
        String numStr = "";
        
        for(int i=chArr.length-1; i>=0; i--)
            numStr += chArr[i];
        
        answer = Integer.parseInt(numStr, 3);        
        return answer;
    }
}