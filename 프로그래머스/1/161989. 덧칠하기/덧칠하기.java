class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int num = section[0] + m;
        int i = 0;
        
        while(true) {
            if(num > n || i > section.length-1)
                break;
            if(section[i] < num)
                i++;
            else {
                num = section[i] + m;
                answer++;
            }
        }
        
        return answer;
    }
}