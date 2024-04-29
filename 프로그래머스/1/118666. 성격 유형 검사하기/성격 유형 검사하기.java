import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] type = {"RT", "CF", "JM", "AN"};
        String[] typeReverse = {"TR", "FC", "MJ", "NA"};
        char[] chAns = { 'R', 'C', 'J', 'A' };
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<survey.length; i++) {            
            char[] chArr = survey[i].toCharArray();

            for(int j=0; j<chArr.length; j++)
                    map.put(chArr[j], map.getOrDefault(chArr[j], 0));
            
            if(choices[i] < 4)
                map.put(chArr[0], map.getOrDefault(chArr[0], 0) + 4-choices[i]); 
            else if(choices[i] > 4) 
                map.put(chArr[1], map.getOrDefault(chArr[1], 0) + choices[i]-4); 
                
            for(int idx = 0; idx<type.length; idx++) {
                if(survey[i].equals(type[idx]) 
                   || survey[i].equals(typeReverse[idx])) {
                    if(map.get(chArr[0]) > map.get(chArr[1]))
                        chAns[idx] = chArr[0];
                    else if(map.get(chArr[0]) < map.get(chArr[1]))
                        chAns[idx] = chArr[1];
                    else {
                        Arrays.sort(chArr);
                        chAns[idx] = chArr[0];
                    }
                    break;
                }
            }  
        }
        
        for(int idx = 0; idx<type.length; idx++)
            answer += chAns[idx];
        
        return answer;
    }
}