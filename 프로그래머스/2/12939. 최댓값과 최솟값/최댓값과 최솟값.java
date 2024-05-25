class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split(" ");
        int min = 0, max = 0;
        
        for(int i=0; i<numbers.length; i++) {
            int checkedNumber = checkMinusContains(numbers[i]);
            if(!numbers[i].isEmpty()) {
                if(i == 0) {
                    min = checkedNumber;
                    max = checkedNumber;
                } else {
                    if(min > checkedNumber)
                        min = checkedNumber;
                    if(max < checkedNumber)
                        max = checkedNumber;
                }
            }
        }
        answer = min + " " + max;
        return answer;
    }
    
    private int checkMinusContains(String numStr) {
        int number = 0;
        if(numStr.contains("-")) {
            int onlyNum = Integer.parseInt(numStr.substring(1));
            number = onlyNum * -1;
        } else {
            number = Integer.parseInt(numStr);
        }
        return number;
    }
}