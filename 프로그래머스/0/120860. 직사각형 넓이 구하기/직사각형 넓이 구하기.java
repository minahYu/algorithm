import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        
        int minX = 256, minY = 256;
        int maxX = -256,  maxY = -256;
        for(int i=0; i<dots.length; i++) {
            maxX = Math.max(dots[i][0], maxX);
            minX = Math.min(dots[i][0], minX);
            maxY = Math.max(dots[i][1], maxY);
            minY = Math.min(dots[i][1], minY);
        }
        
        int width = Math.abs(maxX-minX);
        int height = Math.abs(maxY-minY);
    
        answer = width * height;
        
        return answer;
    }
}