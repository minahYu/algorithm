import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        
        int[] parent = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
        }
        
        for(int[] edge : costs) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            
            if(find(parent, from) != find(parent, to)) {
                union(parent, from, to);
                answer += cost;
            }
        }
        
        return answer;
    }
    
    private int find(int[] parent, int x) {
        if(parent[x] == x) {
            return x;
        }
        
        return parent[x] = find(parent, parent[x]);
    }
    
    private void union(int[] parent, int a, int b) {
        int rootA = parent[a];
        int rootB = parent[b];
        
        if(rootA != rootB) {
            parent[rootA] = rootB;
        }
    }
}