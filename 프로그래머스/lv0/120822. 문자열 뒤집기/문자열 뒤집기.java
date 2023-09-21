class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] string_array = my_string.toCharArray();
        char[] temp = new char[string_array.length];
        
        for(int i=0; i<string_array.length; i++) {
             temp[i] = string_array[string_array.length-(i+1)];
        }
        answer = new String(temp);
        
        return answer;
    }
}