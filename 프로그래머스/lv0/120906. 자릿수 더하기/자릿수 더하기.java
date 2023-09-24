class Solution {
    public int solution(int n) {
        int answer = 0;
        String tempN = String.valueOf(n);
        
        for(int i=0; i<tempN.length(); i++) {
            answer += tempN.charAt(i) - '0';
        }
        
        return answer;
    }
}