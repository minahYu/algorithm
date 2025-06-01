import java.util.List;
import java.util.ArrayList;

class Solution {
    static List<String> list = new ArrayList<>();
    static String[] vowels = { "A", "E", "I", "O", "U" };
    
    public int solution(String word) {
        int answer = 0;
        
        dfs("", 0);
        answer = list.indexOf(word) + 1;
        
        return answer;
    }
    
    public void dfs(String str, int depth) {
        if(depth > 5) return;
        
        if(!str.equals("")) {
            list.add(str);
        }
        
        for(int i=0; i<5; i++) {
            dfs(str + vowels[i], depth + 1);
        }
    }
}