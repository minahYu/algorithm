import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        String[] todayArr = today.split("\\.");
        Map<String, Integer> map = new HashMap<>();
        int period = 0, periodSum = 0;
        
        for(String term : terms) {
            String[] termArr = term.split(" ");
            map.put(termArr[0], Integer.parseInt(termArr[1]));
        }
        
        for(int i=0; i<privacies.length; i++) {
            String[] privacyArr = privacies[i].split(" ");
            String[] ymd = privacyArr[0].split("\\.");
            int year = Integer.parseInt(ymd[0]);
            int month = Integer.parseInt(ymd[1]);
            
            period = map.get(privacyArr[1]);
            periodSum = month + period;
            year += (periodSum % 12) == 0 ? (periodSum / 12)-1 : (periodSum / 12);
            month = (periodSum % 12) == 0 ? 12 : periodSum % 12;
            
            if(Integer.parseInt(todayArr[0]) > year) {
                list.add(i+1);
            } else if(Integer.parseInt(todayArr[0]) == year) {
                if(Integer.parseInt(todayArr[1]) > month) {
                    list.add(i+1);
                } else if(Integer.parseInt(todayArr[1]) == month) {
                    if(Integer.parseInt(todayArr[2]) >= Integer.parseInt(ymd[2])) {
                        list.add(i+1);
                    }
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}