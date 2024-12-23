import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int beforeToken = 0;
        StringTokenizer sb = new StringTokenizer(s);         
        
        while(sb.hasMoreTokens()) {
            String token = sb.nextToken(); 
            
            if(token.equals("Z")) {
                answer -= beforeToken;
            } else {
                answer += Integer.parseInt(token);
                beforeToken = Integer.parseInt(token); 
            }
            System.out.println(answer);
        }
        
        return answer;
    }
}