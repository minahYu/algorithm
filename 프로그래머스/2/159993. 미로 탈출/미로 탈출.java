import java.util.*;

class Solution {
    private static char[][] map;
    
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {-1, 1, 0, 0};
    
    private static int M, N;
    
    public int solution(String[] maps) {
        int answer = 0;
        
        M = maps.length; 
        N = maps[0].length();
        
        map = new char[M][N];
        int[] start = new int[2];
        int[] lever = new int[2];
        
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                map[i][j] = maps[i].charAt(j);
                
                if(map[i][j] == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
                
                if(map[i][j] == 'L') {
                    lever[0] = i;
                    lever[1] = j;
                }
            }
        }
        
        int distToL = bfs(start, 'L');
        if(distToL == -1) return -1;
        
        int distToE = bfs(lever, 'E');
        if(distToE == -1) return -1;
        
        answer = distToL + distToE;
        return answer;
    }
    
    private static int bfs(int[] start, char destination) {
        boolean[][] visited = new boolean[M][N];
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[] {start[0], start[1], 0});
        visited[start[0]][start[1]] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], dist = cur[2];
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if(visited[nx][ny] || map[nx][ny] == 'X') continue;
                
                if(map[nx][ny] == destination) return dist + 1;
                
                visited[nx][ny] = true;
                q.offer(new int[] {nx, ny, dist+1});
            }
        }
        return -1;
    }
}