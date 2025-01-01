import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        
        char[] dartChArr = dartResult.toCharArray();
        int scoreIndex = -1;
        for(int i=0; i<dartChArr.length; i++) {
            if(Character.isDigit(dartChArr[i])) {
                scoreIndex++;
                scores[scoreIndex] = Character.getNumericValue(dartChArr[i]);
                if(Character.isDigit(dartChArr[i+1])) {
                    i++;
                    scores[scoreIndex] *= 10;  
                }
            }
            
            switch(dartChArr[i]) {
                case 'S':
                    scores[scoreIndex] = (int)Math.pow(scores[scoreIndex], 1);
                    break;
                case 'D':
                    scores[scoreIndex] = (int)Math.pow(scores[scoreIndex], 2);
                    break;
                case 'T':
                    scores[scoreIndex] = (int)Math.pow(scores[scoreIndex], 3);
                    break;
            }
            
            if(dartChArr[i] == '*') {
                scores[scoreIndex] *= 2;
                if(scoreIndex > 0) {
                    scores[scoreIndex-1] *= 2;
                }
            }
            if(dartChArr[i] == '#') {
                scores[scoreIndex] *= -1;
            }
        }
        
        for(int i=0; i<scores.length; i++) {
            answer += scores[i];   
        }
        
        return answer;
    }
}