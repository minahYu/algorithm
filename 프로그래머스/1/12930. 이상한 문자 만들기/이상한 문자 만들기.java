class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sCharArr = s.toCharArray();
        int j = 0;

        for(int i=0; i<s.length(); i++) {
            if(j%2 == 0) 
                answer += String.valueOf(sCharArr[i]).toUpperCase();
            else
                answer += String.valueOf(sCharArr[i]).toLowerCase();
            j++;
            
            if(sCharArr[i] == ' ')
                j = 0;
        }
        return answer;
    }
}