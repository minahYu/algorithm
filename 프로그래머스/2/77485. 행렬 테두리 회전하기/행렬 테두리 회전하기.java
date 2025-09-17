import java.util.*;

class Solution {
    private static int[][] matrix;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        matrix = new int[columns][rows];
        createMatrix(rows, columns);
        
        for(int i=0; i<queries.length; i++) {
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            
            Deque<Integer> deque = new ArrayDeque<>();
            createBorder(x1, y1, x2, y2, deque);
            
            deque.add(deque.pollFirst());
            
            List<Integer> list = new ArrayList<>(deque);
            Collections.sort(list);
            answer[i] = list.get(0);
            
            rotate(x1, y1, x2, y2, deque);
            
        }
        
        return answer;
    }
    
    private static void createBorder(int x1, int y1, int x2, int y2, Deque<Integer> deque) {
        for(int j=x1; j<=x2; j++) deque.add(matrix[y1][j]);
        for(int j=y1+1; j<=y2; j++) deque.add(matrix[j][x2]);
        for(int j=x2; j>=x1; j--) deque.add(matrix[y2][j]);
        for(int j=y2-1; j>y1; j--) deque.add(matrix[j][x1]);
    }
    
    private static void rotate(int x1, int y1, int x2, int y2, Deque<Integer> deque) {
        for(int j=x1; j<=x2; j++) matrix[y1][j] = deque.pollFirst();
        for(int j=y1+1; j<=y2; j++) matrix[j][x2] = deque.pollFirst();
        for(int j=x2; j>=x1; j--)  matrix[y2][j] = deque.pollFirst();
        for(int j=y2-1; j>y1; j--) matrix[j][x1] = deque.pollFirst();
    }
    
    private static void createMatrix(int r, int c) {
        int num = 1;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[j][i] = num++;
            }
        }
    }
}