import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1)
            return new int[] {-1};
        
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int[] answer = new int[arr.length-1];
        int j = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != sortedArr[0]) {
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}