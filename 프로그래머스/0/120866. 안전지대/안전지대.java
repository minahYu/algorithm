class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int dangerArea = 0;
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 1) {
                    dangerArea++;
                    if(j > 0 && board[i][j-1] != 1) {
                        board[i][j-1] = 3;
                        if(i > 0 && board[i-1][j-1] != 1) {
                            board[i-1][j-1] = 3;
                        }
                        if(i < board.length-1 && board[i+1][j-1] != 1) {
                            board[i+1][j-1] = 3;
                        } 
                    }
                    if(j < board[i].length-1 && board[i][j+1] != 1) {
                        board[i][j+1] = 3;
                        if(i > 0 && board[i-1][j+1] != 1) {
                            board[i-1][j+1] = 3;
                        }
                        if(i < board.length-1 && board[i+1][j+1] != 1) {
                            board[i+1][j+1] = 3;
                        } 
                    }
                    if(i > 0 && board[i-1][j] != 1) {
                        board[i-1][j] = 3;
                    }
                    if(i < board.length-1 && board[i+1][j] != 1) {
                        board[i+1][j] = 3;
                    }
                }
            }
        }
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 3) {
                    dangerArea++;
                }
            }
        }
        answer = board.length * board[0].length - dangerArea;
        
        return answer;
    }
}