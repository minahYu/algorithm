import java.util.*;

class Solution {
    private static List<int[]> moves = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);
        
        int[][] answer = new int[moves.size()][2];
        
        for(int i=0; i<moves.size(); i++) {
            answer[i] = moves.get(i);
        }
        
        return answer;
    }
    
    private static void hanoi(int n, int from, int to, int temp) {
        if(n == 0) return;
        
        hanoi(n-1, from, temp, to);
        moves.add(new int[]{from, to});
        hanoi(n-1, temp, to, from);
    }
}