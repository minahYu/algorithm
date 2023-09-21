class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char[] rsp_array = rsp.toCharArray();
        
        for(int i=0; i<rsp_array.length; i++) {
            if(rsp_array[i] == '0') {
                answer += '5';
            } else if(rsp_array[i] == '2') {
                answer += '0';
            } else if(rsp_array[i] == '5') {
                answer += '2';
            }
        }
        
        
        return answer;
    }
}