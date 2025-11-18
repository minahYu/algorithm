import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    private String[] answer;
    private boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        visited = new boolean[tickets.length];
        
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        
        List<String> path = new ArrayList<>();
        path.add("ICN");
        
        dfs("ICN", 0, path, tickets);
        
        return answer;
    }
    
    private boolean dfs(String current, int count, List<String> path, String[][] tickets) {
        if(count == tickets.length) {
            answer = path.toArray(new String[0]);
            return true;
        }
        
        for(int i=0; i<tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                path.add(tickets[i][1]);
                
                if(dfs(tickets[i][1], count+1, path, tickets)) {
                    return true;
                }
                
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
        return false;
    }
}