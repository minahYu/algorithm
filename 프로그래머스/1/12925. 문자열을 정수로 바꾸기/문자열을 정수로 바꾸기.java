class Solution {
    public int solution(String s) {
        return s.charAt(0)=='-'?Integer.valueOf(s.replace("-",""))*-1:Integer.valueOf(s.replace("-",""));
    }
}