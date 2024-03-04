class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        int len = s.length();
        
        if(len != 4 && len != 6)
            answer = false;
        else {
            System.out.println(len);
            for(int i=0; i<len; i++) {
                if(!answer) 
                    break;
                if(!(charArr[i] - '0' >= 0 && charArr[i] - '0' <= 9))
                    answer = false;
            }
        }
        
        return answer;
    }
}