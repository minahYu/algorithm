import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 1;
        
        Arrays.sort(book_time, (r1, r2) -> r1[0].compareTo(r2[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((r1, r2) -> r1[1] - r2[1]); 
        
        for(String[] book : book_time) {
            String[] inTime = book[0].split(":");
            String[] outTime = book[1].split(":");
            
            int in = Integer.parseInt(inTime[0]) * 60 + Integer.parseInt(inTime[1]);
            int out = Integer.parseInt(outTime[0]) * 60 + Integer.parseInt(outTime[1]) + 10;
            
            while(!pq.isEmpty() && pq.peek()[1] <= in) {
                pq.poll();
            }
            
            pq.offer(new int[] {in, out});
            
            answer = Math.max(pq.size(), answer);
        }
        
        return answer;
    }
}