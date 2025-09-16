import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, -1, 0, 1};
    
    private static int[][] map;
    private static boolean[][] visited;
    
    private static int M, N;
    
    public int[] solution(String[] maps) {
        boolean allOcean = true;
        
        M = maps.length;
        N = maps[0].length();
        
        visited = new boolean[M][N];
        map = new int[M][N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(maps[i].charAt(j) == 'X') {
                    map[i][j] = 0;
                    visited[i][j] = true;
                } else {
                    allOcean = false;
                    map[i][j] = maps[i].charAt(j) - '0';
                }
            }
        }
        
        if(allOcean) {
            return new int[]{-1};
        }
        
        List<Integer> sums = new ArrayList<>();
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && map[i][j] > 0) {
                    int sum = dfs(i, j, 0);
                    
                    if(sum > 0) sums.add(sum);
                }
            }
        }
        
        Collections.sort(sums);
        
        int[] answer = new int[sums.size()];
        for(int i=0; i<sums.size(); i++) {
            answer[i] = sums.get(i);
        }
        
        return answer;
    }
    
    private static int dfs(int x, int y, int days) {
        if(visited[x][y]) return 0;
        
        visited[x][y] = true;
        int sum = map[x][y];
        
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] > 0) {
                sum += dfs(nx, ny, 0);
            }
        }
        
        return sum;
    }
}