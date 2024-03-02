import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        
        Arrays.sort(chArr);
        for(int i=chArr.length-1; i>=0; i--)
            answer += chArr[i];
        
        return answer;
    }
}