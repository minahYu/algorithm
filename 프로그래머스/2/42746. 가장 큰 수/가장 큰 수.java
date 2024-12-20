import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        Integer[] numberArray = Arrays.stream(numbers)
                                      .boxed()
                                      .toArray(Integer[]::new);
        
        Arrays.sort(numberArray, new Comparator<Integer> () {
            @Override
            public int compare(Integer num1, Integer num2) {
                    
                int result = 0;
                String str1 = num1.toString();
                String str2 = num2.toString();
                
                return (str2 + str1).compareTo(str1 + str2);
            }
        });
        
        for(Integer num : numberArray) {
            answer += num.toString();
        }
        
        if(answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}