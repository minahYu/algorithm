import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int[] newArr = new int[commands[i][1] - commands[i][0]+1];
            for(int j=commands[i][0]; j<=commands[i][1]; j++) 
                newArr[j-commands[i][0]] = array[j-1];
            Arrays.sort(newArr);
            answer[i] = newArr[commands[i][2]-1];
        }
        return answer;
    }
}