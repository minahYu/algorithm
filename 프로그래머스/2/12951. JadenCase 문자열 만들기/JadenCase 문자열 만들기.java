class Solution {
    public String solution(String s) {
        String answer = "";
        boolean toUpper = true;
        s = s.toLowerCase();
        
        for(char ch : s.toCharArray()) {
            if(toUpper) {
                answer += Character.toUpperCase(ch);
                toUpper = false;
            } else {
                answer += ch;
            }
            if(ch == ' ') 
                toUpper = true;
        }
        return answer;
    }
}