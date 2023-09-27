class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        strArr[num1] = String.valueOf(my_string.charAt(num2));
        strArr[num2] = String.valueOf(my_string.charAt(num1));
        
        answer = String.join("", strArr);
        
        return answer;
    }
}