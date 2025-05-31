import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Character> queue = new LinkedList<>();
        Queue<Integer> prioritiesQueue = new LinkedList<>();
        int[] prioritiesCopy = Arrays.copyOf(priorities, priorities.length);
        
        for(char i=0; i<priorities.length; i++) {
            queue.add((char)('A' + i));
            prioritiesQueue.add(priorities[i]);
        }
        
        Arrays.sort(prioritiesCopy);
        int i = priorities.length-1;
        int max = prioritiesCopy[i--];
        
        char[] order = new char[priorities.length];
        int idx = 0;
        
        while(!queue.isEmpty()) {
               if(prioritiesQueue.peek() < max) {
                   queue.add(queue.poll());
                   prioritiesQueue.add(prioritiesQueue.poll());
               } else {
                   order[idx++] = queue.poll();
                   prioritiesQueue.poll();
                   if(i >= 0) {
                      max = prioritiesCopy[i--]; 
                   } 
               }
        }  
        
        char target = (char)('A' + location);
        for(int j=0; j<order.length; j++) {
            if(order[j] == target) {
                answer =  j + 1;
                break;
            }
        }
        return answer;
    }
}