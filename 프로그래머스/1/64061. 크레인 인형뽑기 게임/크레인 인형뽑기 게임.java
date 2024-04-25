import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    list.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
            
            if(list.size() >= 2) {
               for(int j=1; j<list.size(); j++) {
                   if(list.get(j) == list.get(j-1)) {
                        list.remove(j);
                        list.remove(j-1);
                        answer += 2;
                   }
               } 
            }
        }
        
        return answer;
    }
}