class Solution {
    private static int[] queen;
    private static int answer;
    
    public int solution(int n) {
        answer = 0;
        queen = new int[n];
        
        dfs(0, n);
        
        return answer;
    }
    
    private static void dfs(int row, int n) {
        if(row == n) {
            answer++;
            return;
        }
        
        for(int col=0; col<n; col++) {
            queen[row] = col;
            boolean safe = true;
            
            for(int i=0; i<row; i++) {
                if(queen[i] == col) {
                    safe = false;
                    break;
                }

                if(Math.abs(row - i) == Math.abs(col - queen[i])) {
                    safe = false;
                    break;
                }  
            }
            
            if(safe) {
                dfs(row+1, n);
            }
        }    
    }
}