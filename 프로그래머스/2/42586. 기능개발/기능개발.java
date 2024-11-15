import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

class Solution {
    private static List<Integer> progressList = new ArrayList<>();
    private static List<Integer> speedList = new ArrayList<>();
    
    public int[] solution(int[] progresses, int[] speeds) {
        arrayToList(progresses, speeds);
        
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while(progressList.size() != 0) {
            if(progressList.get(0) >= 100) {
                for(int i=0; i<progressList.size(); i++) {
                    if(progressList.get(i) >= 100) {
                        count++; 
                        progressList.remove(0);
                        speedList.remove(0);
                        
                        if(progressList.size() > 0 && progressList.get(0) < 100) {
                            stack.push(count);
                            count = 0;
                        }
                    }
                }
            } else {                
                for(int i=0; i<progressList.size(); i++) {
                    progressList.set(i, progressList.get(i) + speedList.get(i));
                }
            }        
        }
        
        if(count != 0) {
            stack.push(count);
        }
        
        int[] answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
    
        
    private static void arrayToList(int[] progresses, int[] speeds) {
        for(int i=0; i<progresses.length; i++) {
            progressList.add(progresses[i]);
            speedList.add(speeds[i]);
        }
    }
}