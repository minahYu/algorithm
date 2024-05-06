import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        List<String> playerList = new ArrayList<>();
        Map<String, Integer> playerMap = new LinkedHashMap<>();
        int callingIdx = 0;
        
        for(int i=0; i<players.length; i++) {
            playerList.add(players[i]);
            playerMap.put(players[i], i);
        }
        
        for(String calling : callings) {
            callingIdx = playerMap.get(calling);
            playerList.remove(callingIdx);
            playerList.add(callingIdx-1, calling);
            
            playerMap.put(calling, callingIdx-1);
            playerMap.put(playerList.get(callingIdx), callingIdx);
        }
        
        answer = playerList.toArray(answer);
        
        return answer;
    }
}