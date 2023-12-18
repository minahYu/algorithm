class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0, round = 0, len = 0;
        String binary = "";
            
        while(true) {
            binary = "";
            if(s.equals("0") || s.equals("1"))
                break;
            
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0') 
                    count++;
                else
                   binary += String.valueOf(s.charAt(i)); 
            }
            len = binary.length();
            s = String.valueOf(Integer.toBinaryString(len));
            round++;
        }
        
        answer[0] = round;
        answer[1] = count;
        
        return answer;
    }
}