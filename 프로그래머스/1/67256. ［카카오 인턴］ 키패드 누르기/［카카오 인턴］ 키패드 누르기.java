import java.lang.Math;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int curR = 10, curL = 12;
        
        for(int num : numbers) {
            if(num == 0)
                num = 11;
            switch(num % 3) {
                case 1:
                    curL = num;
                    answer += "L";
                    break;
                case 0:
                    curR = num;
                    answer += "R";
                    break;
                case 2:
                    int left = distance(num, curL);
                    int right = distance(num, curR);
                    
                    if(left < right || (left == right && hand.equals("left"))) {
                        curL = num;
                        answer += "L";
                    } else {
                        curR = num;
                        answer += "R";
                    }
                    break;
            }
        } 
        return answer;
    }
    
    int distance(int goal, int current) {       
        return Math.abs((goal - 1) % 3 - (current - 1) % 3)
            + Math.abs((goal - 1) / 3 - (current - 1) / 3);
    }
}