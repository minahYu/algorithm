import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] sortStrs = new char[strings.length];
        int idx = 0;
        
        Arrays.sort(strings);
        for(int i=0; i<strings.length; i++) 
            sortStrs[i] = strings[i].charAt(n);

        Arrays.sort(sortStrs);
        for(int i=0; i<strings.length; i++) {
            for(int j=0; j<strings.length; j++) {
                if(!strings[j].equals(" ") && sortStrs[i] == strings[j].charAt(n)) {
                    answer[idx] = strings[j];
                    idx++;
                    strings[j] = " ";
                }
            }
        }
        return answer;
    }
}