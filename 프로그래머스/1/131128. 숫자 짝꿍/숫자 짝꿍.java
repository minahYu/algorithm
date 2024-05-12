import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        Map<Character, Integer> xMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        boolean onlyZero = true;
        
        for(char xCh : X.toCharArray())
            xMap.put(xCh, xMap.getOrDefault(xCh, 0) + 1);  
            
        for(char yCh : Y.toCharArray()) {
            if(xMap.containsKey(yCh) && xMap.get(yCh) > 0) {
                xMap.put(yCh, xMap.get(yCh) - 1);
                sb.append(yCh);                   
            } 
        }
        
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        
        if(arr.length == 0) {
            return "-1";
        } else {
            for(int i=arr.length-1; i>=0; i--) {
                if(arr[i] != '0')
                    onlyZero = false;
                answer.append(arr[i]);
                if(onlyZero)
                    return "0";
            }
        }     
        
        return answer.toString();
    }
}