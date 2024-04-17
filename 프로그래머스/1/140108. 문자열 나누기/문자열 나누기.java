class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCount = 0, otherCount = 0;
        char[] sArr = s.toCharArray();
        char x = ' ';
    
        for(int i=0; i<sArr.length; i++) {
            if(xCount == 0 && otherCount == 0)
                x = sArr[i];
            
            if(x == sArr[i]) 
                xCount++;
            else 
                otherCount++;
            
            if(xCount == otherCount) {
                answer++;
                xCount = 0;
                otherCount = 0;
            }
        }
        if(xCount != otherCount)
            answer++;
        
        return answer;
    }
}