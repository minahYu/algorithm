import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set> receiving = new HashMap<>();
        Map<String, Integer> userIdx = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++)
            userIdx.put(id_list[i], i);
        
        for(int i=0; i<report.length; i++) {
            Set<Integer> reporting = new HashSet<>();
            String[] reportArr = report[i].split(" ");
            
            if(!receiving.containsKey(reportArr[1])) {
                reporting.add(userIdx.get(reportArr[0]));
                receiving.put(reportArr[1], reporting);
            } else {
                receiving.get(reportArr[1]).add(userIdx.get(reportArr[0]));
            }
        }
        
        for(String user : id_list) {
            if(receiving.get(user) != null 
               && receiving.get(user).size() >= k) {
                
                Iterator<Integer> iter = receiving.get(user).iterator();
                while(iter.hasNext())
                    answer[iter.next()]++;     
            }
        }
        
        return answer;
    }
}