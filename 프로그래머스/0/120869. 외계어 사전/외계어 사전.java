import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<dic.length; i++) {
            List<String> spellList = new ArrayList<String>(Arrays.asList(spell));
            
            for(int j=0; j<spell.length; j++) {               
                if(dic[i].contains(spellList.get(0))) {
                    dic[i] = dic[i].replace(spellList.get(0), "");
                    spellList.remove(0);
                }
            }
            
            if(spellList.size() == 0 && Arrays.asList(dic).contains("")) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}