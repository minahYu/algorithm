class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] sArr = new char[s.length()];
        int xCnt = 1, otherCnt = 0;
        char x = '0';

        sArr = s.toCharArray();
        x = sArr[0];
        
        for(int i=1; i<s.length(); i++) {
            if(sArr[i] == x)
                xCnt++;
            else
                otherCnt++;
            
            if(xCnt == otherCnt) {
                if(i<s.length()-1)
                    x = sArr[i+1];
                answer++;
                xCnt = 0;
                otherCnt = 0;
            }
        }
        
        if(xCnt != 0)
            answer++;
        
        return answer;
    }
}