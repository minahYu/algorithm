class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int index = (String.valueOf(num)).indexOf(k+'0');
        
        answer = (index == -1) ? index : (index + 1);
        
        return answer;
    }
}