class Solution {
    private static boolean[] visited;
    private static int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        int count = 0;
        visited = new boolean[dungeons.length];
        
        dfs(k, count, dungeons);
        
        return answer;
    }
    
    private static void dfs(int k, int count, int[][] dungeons) {
        answer = Math.max(answer, count);
        
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k-dungeons[i][1], count+1, dungeons);
                visited[i] = false; 
            }
        }
    }
}