import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> priorityQueue = new PriorityQueue<>();   
        for(int s : scoville) {
            priorityQueue.add(s);
        }
        
        while(priorityQueue.size() >= 2 && priorityQueue.peek() < K) {
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            int mixed = first + (second * 2);
            
            priorityQueue.add(mixed);
            answer++;
        }
        
        answer = priorityQueue.peek() >= K ? answer : -1;
        
        return answer;
    }
}