class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        boolean check = true;
        String[] strArr = { "aya", "ye", "woo", "ma" };
        String[] strReplace = { "1", "2", "3", "4" };
        char before = ' ';
        
        for(int i=0; i<babbling.length; i++) {
            for(int j=0; j<strArr.length; j++)
                babbling[i] = babbling[i].replace(strArr[j], strReplace[j]);
                
            char[] chArr = babbling[i].toCharArray();
            
            if(chArr.length == 1) {
                if(Character.isDigit(chArr[0]))
                    answer++;
            } else {
                check = true;
                before = ' ';
                
                for(int j=0; j<chArr.length; j++) {
                    if(!Character.isDigit(chArr[j]) || chArr[j] == before)
                        check = false;
                    before = chArr[j];
                }

                if(check)
                    answer++;
            }
        }    
        return answer;
    }
}