import java.util.Queue;
import java.util.LinkedList;

class Solution {
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    
    private static char[][] map;
    private static int m, n;
    
    public int solution(String[] board) {
        int answer = 0;
        
        m = board.length;
        n = board[0].length();
        map = new char[m][n];
        
        int curX = 0, curY = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                map[i][j] = board[i].charAt(j);
                
                if(map[i][j] == 'R') {
                    curX = i;
                    curY = j;
                }
            }
        }
        
        answer = bfs(curX, curY);
        
        return answer;
    }
    
    private int bfs(int startX, int startY) {
        boolean[][] visited = new boolean[m][n];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1], count = cur[2];
            
            if(map[x][y] == 'G') return count;
            
            for(int i=0; i<4; i++) {
                int nx = x;
                int ny = y;
                
                while(nx + dx[i] >= 0 && ny + dy[i] >= 0 && nx + dx[i] < m && ny + dy[i] < n && map[nx + dx[i]][ny + dy[i]] != 'D') {
                    nx += dx[i];
                    ny += dy[i];
                }
                
                if(!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, count+1});
                }
            }
        }
        
        return -1;
    }
}