class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int strlist_len = strlist.length;
        
        answer = new int[strlist_len];
        
        for(int i=0; i<strlist_len; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}