class Solution {
    public String solution(String s) {
        String answer = "";
        int j = 0;
        char[] sArr = s.toCharArray();
        
        for(int i=0; i<s.length(); i++) {
            if(j%2 == 1)
                answer += String.valueOf(sArr[i]).toLowerCase();
            else 
                answer += String.valueOf(sArr[i]).toUpperCase();
            j++;
            if(sArr[i] == ' ')
                j = 0;
        }
        
        return answer;
    }
}