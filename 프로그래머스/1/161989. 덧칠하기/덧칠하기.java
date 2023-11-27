class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int notFull = section[0] + m;
        
        for(int i=1; i<section.length; i++) {
            if(section[i] >= notFull) {
                answer++;
                notFull = section[i] + m;
            }
        }
        
        return answer;
    }
}