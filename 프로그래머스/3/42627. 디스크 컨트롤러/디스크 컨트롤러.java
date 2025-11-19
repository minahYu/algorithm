import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] jobs1, int[] jobs2) {
                return jobs1[1] - jobs2[1];
            }
        });
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        int completedJobs = 0;
        int idx = 0, time = 0;
        while(completedJobs < jobs.length) {
            while(idx < jobs.length && jobs[idx][0] <= time) {
                heap.offer(jobs[idx++]);
            }
            
            if(!heap.isEmpty()) {
                int[] job = heap.poll();
                time += job[1];
                answer += time - job[0];
                completedJobs++;
            } else {
                if(idx < jobs.length) {
                    time = jobs[idx][0];
                }
            }
        }
                           
        answer /= jobs.length;
        
        return answer;
    }
}