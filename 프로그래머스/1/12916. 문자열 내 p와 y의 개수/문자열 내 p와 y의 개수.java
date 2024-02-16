class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] sChar = s.toLowerCase().toCharArray();
        int pCnt = 0, yCnt = 0;

        for(int i=0; i<s.length(); i++) {
            if(sChar[i] == 'p')
                pCnt++;
            else if(sChar[i] == 'y')
                yCnt++;
        }
        if(pCnt != yCnt)
            answer = false;

        return answer;
    }
}