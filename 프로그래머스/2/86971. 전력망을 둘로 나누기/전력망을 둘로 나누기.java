import java.util.List;
import java.util.ArrayList;

class Solution {
    private static boolean[] visited;
    private static List<Integer>[] list;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        list = new ArrayList[n+1];
        for(int i=1; i<=n; i++) list[i] = new ArrayList<>();
        for(int[] w : wires) {
            int v = w[0], u = w[1];
            list[v].add(u);
            list[u].add(v);
        }
        
        for(int[] w : wires) {
            int cur = w[0], next = w[1];
            
            visited = new boolean[n+1];
            int count = dfs(cur, cur, next);
            int diff = Math.abs(n - 2*count);
            answer = Math.min(answer, diff);
        } 
        
        return answer;
    }
    
    private static int dfs(int u, int cur, int next) {
        visited[u] = true;
        int count = 1;
        
        for(int v : list[u]) {
           if((v == cur && u == next) || (v == next && u == cur)) continue;  
            if(!visited[v]) count += dfs(v, cur, next);
        }
        
        return count;
    }
}