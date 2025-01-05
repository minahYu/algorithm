import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        if(numbers.length == 2) {
            return numbers[0] * numbers[1];
        }
        
        List<Integer> positiveNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > 0) {
                positiveNums.add(numbers[i]);
            } else if(numbers[i] < 0) {
                negativeNums.add(numbers[i]);
            }
        }
        
        Collections.sort(positiveNums, Collections.reverseOrder());
        Collections.sort(negativeNums, Collections.reverseOrder());
        
        if(negativeNums.size() >= 2 && positiveNums.size() >= 2) {
            answer = Math.max(positiveNums.get(0) * positiveNums.get(1), negativeNums.get(0) * negativeNums.get(1));
        } else if(positiveNums.size() >= 2) {
            answer = positiveNums.get(0) * positiveNums.get(1);
        } else if(negativeNums.size() >= 2) {
            answer = negativeNums.get(0) * negativeNums.get(1);
        }
        
        return answer;
    }
}