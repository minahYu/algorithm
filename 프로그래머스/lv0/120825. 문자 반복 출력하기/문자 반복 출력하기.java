class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strArr = new String[my_string.length()];
        StringBuilder sb = new StringBuilder();
        
        strArr = my_string.split("");
        
        for(String arr : strArr) {
            for(int i=0; i<n; i++) {
                sb.append(arr);
            }
        }
        answer = String.valueOf(sb);
        
        return answer;
    }
}