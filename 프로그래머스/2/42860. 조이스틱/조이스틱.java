class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();
        
        for(int i=0; i<n; i++) {
            int diff = name.charAt(i) - 'A';
            answer += Math.min(diff, 26 - diff);
        }
        
        int move = n - 1;
        for(int i=0; i<n; i++) {
            int j = i+1;
            while(j < n && name.charAt(j) == 'A') j++;
            
            move = Math.min(move, 2 * i + (n-j));
            move = Math.min(move, i + 2 * (n-j));
        }
        
        answer += move;
        
        return answer;
    }
}