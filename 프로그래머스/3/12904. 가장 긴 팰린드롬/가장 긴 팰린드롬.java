class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        
        for(int i=1; i<s.length()-1; i++) {
            int j = 1;
            
            while((i-j >= 0 && i+j < s.length())) {
                if(s.charAt(i-j) == s.charAt(i+j)) {
                    int len = j*2 + 1;
                    answer = Math.max(answer, len);
                    j++;
                } else {
                    break;
                }
            }
        }

        for(int i=0; i<s.length()-1; i++) {
            int j = 0;
            
             while((i-j >= 0 && (i+1)+j < s.length())) {
                if(s.charAt(i-j) == s.charAt((i+1)+j)) {
                    int len = j*2 + 2;
                    answer = Math.max(answer, len);
                    j++;
                } else {
                    break;
                }
            }
        }
        
        return answer;
    }
}