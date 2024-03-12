class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        String tCopy = t;
        long num = 0;
        
        for(int i=0; i<=t.length()-pLen; i++) {
            tCopy = t;
            num = Long.parseLong(tCopy.substring(i, i+pLen));
            if(num <= Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}