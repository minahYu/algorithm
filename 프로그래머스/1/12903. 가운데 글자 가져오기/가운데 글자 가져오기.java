class Solution {
    public String solution(String s) {
        String answer = "";
        int halfLen = s.length()/2;
        
        if(s.length()%2 == 0)
            answer = s.substring(halfLen-1, halfLen+1);
        else
            answer = s.substring(halfLen, halfLen+1);
        
        return answer;
    }
}