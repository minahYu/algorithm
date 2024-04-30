class Solution {
    public String solution(String new_id) {
        String answer = "";
        int len = new_id.length();
        StringBuilder sb = new StringBuilder();
        char before = ' ';
        
        new_id = new_id.toLowerCase();
        
        for(char ch : new_id.toCharArray()) {
            if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') 
                || ch == '-' || ch == '_' || ch == '.') {
                if(ch == '.' && before == '.') 
                    continue;
                sb.append(ch);
                before = ch;
            }
            len = sb.length();
        } 
        
        while (sb.length() > 0 && sb.charAt(0) == '.')
            sb.deleteCharAt(0);
        
        while(sb.length() >= 16)
            sb = new StringBuilder(sb.substring(0, 15));
        
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.')
            sb.deleteCharAt(sb.length() - 1);
        
        if(sb.length() == 0)
            sb.append('a');
        
        while(sb.length() <= 2)
            sb.append(sb.charAt(sb.length()-1));
        
        answer = sb.toString();
        
        return answer;
    }
}