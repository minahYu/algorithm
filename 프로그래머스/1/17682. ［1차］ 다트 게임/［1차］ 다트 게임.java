import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        
        char[] chArr = dartResult.toCharArray();
        int index = -1;
        for(int i=0; i<chArr.length; i++) {
            if(Character.isDigit(chArr[i])) {
                index++;
                scores[index] = chArr[i] - '0';
            }
            
            if(chArr[i] == '1' && chArr[i+1] == '0') {
                scores[index] = 10;
                i++;
            }
            
            switch(chArr[i]) {
                case 'S':
                    scores[index] = (int)Math.pow(scores[index], 1);
                    break;
                case 'D':
                    scores[index] = (int)Math.pow(scores[index], 2);
                    break;
                case 'T':
                    scores[index] = (int)Math.pow(scores[index], 3);
                    break;
                case '*':
                    scores[index] *= 2;
                    if(index > 0) {
                        scores[index-1] *= 2;
                    }
                    break;
                case '#':
                    scores[index] *= -1;
                    break;
            }
        }

        for(int i=0; i<scores.length; i++) {
            answer += scores[i];
        }
        
        return answer;
    }
}