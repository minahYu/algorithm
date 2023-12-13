import java.lang.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = { 50, 50, 0, 0 };
        
        for(int y=0; y<wallpaper.length; y++) {
            for(int x=0; x<wallpaper[y].length(); x++) {
                if(wallpaper[y].charAt(x) == '#') {
                    answer[0] = Math.min(answer[0], y);
                    answer[1] = Math.min(answer[1], x);
                    answer[2] = Math.max(answer[2], y+1);
                    answer[3] = Math.max(answer[3], x+1);
                }
            }

        }
        
        return answer;
    }
}