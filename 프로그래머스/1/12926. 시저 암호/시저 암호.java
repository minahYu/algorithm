class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] sArr = s.toCharArray();
        char ch = 'A';
        
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i] == ' ') {
                answer += " ";
            } else {
                ch = (int)sArr[i] >= 97 ? 'a' : 'A';
                answer += (char)(ch + (sArr[i] + n - ch) % 26);
            }
        }
        return answer;
    }
}