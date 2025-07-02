class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        
        boolean[][][] visited = new boolean[11][11][4];
        int x = 5, y = 5, z = 0;
        
        for(char dir : dirs.toCharArray()) {
            int index = "UDRL".indexOf(dir);
            
            int nx = x + dx[index];
            int ny = y + dy[index];
            
            if (nx < 0 || ny < 0 || nx > 10 || ny > 10) {
                continue;
            }
            
            if(!visited[x][y][index] && !visited[nx][ny][index ^ 1]) {
                answer++;
                visited[x][y][index] = true;
                visited[nx][ny][index ^ 1] = true;
            }
            
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}