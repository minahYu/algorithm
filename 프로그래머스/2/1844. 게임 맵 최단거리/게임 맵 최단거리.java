import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    
    static int m, n;
    static boolean[][] visited;
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        m = maps.length; 
        n = maps[0].length;
 
        visited = new boolean[m][n];
        answer = BFS(maps, 0, 0);
        
        return answer;
    }
    
    private static int BFS(int[][] maps, int currentX, int currentY) {
        int m = maps.length - 1;
        int n = maps[0].length - 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{currentX, currentY, 1});
        visited[currentY][currentX] = true;
        
        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            int x = now[0];
            int y = now[1];
            int depth = now[2];
                
            for(int j=0; j<4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];
                    
                if(isValid(nx, ny) && !visited[ny][nx] && maps[ny][nx] == 1) {
                    if(nx == n && ny == m) return depth+1;
                    visited[ny][nx] = true;
                    queue.add(new int[] {nx, ny, depth+1});
                }
            } 
        }
        
        return -1;
    }
    
    private static boolean isValid(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }
}