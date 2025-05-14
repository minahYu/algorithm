class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] dp = new int[n][m];
        boolean[][] isPuddle = new boolean[n][m];
        
        for(int[] puddle : puddles) {
            int x = puddle[0] - 1;
            int y = puddle[1] - 1;
            isPuddle[y][x] = true;
        }
        
        dp[0][0] = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(isPuddle[i][j]) {
                    dp[i][j] = 0;
                    continue;
                }
                
                if(i > 0) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j]) % 1000000007;
                }
                if(j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i][j-1]) % 1000000007;
                }
            }
        }
        
        answer = dp[n-1][m-1];
        return answer;
    }
}