import java.util.Arrays;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int day = checkDay(number);
        
        for(int i=0; i<day; i++) {
            for(int j=0; j<want.length; j++) {
                if(discount[i].equals(want[j])) {
                    number[j]--;
                }
            }
        }
        
        if(!checkRemain(number)) {
           answer++;
        }
        
        for(int i=day; i<discount.length; i++) {
            int j = i - day;
            
            for(int k=0; k<want.length; k++) {
                if(discount[j].equals(want[k])) {
                    number[k]++;
                }
            }
            
            for(int k=0; k<want.length; k++) {
                if(discount[i].equals(want[k])) {
                    number[k]--;
                }
            }
            
            if(!checkRemain(number)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private int checkDay(int[] number) {
        int day = 0;
        
        for(int i=0; i<number.length; i++) {
            day += number[i];
        }
        return day;
    }
    
    private boolean checkRemain(int[] number) {
        boolean remain = false;
        
        for(int i=0; i<number.length; i++) {
            if(number[i] > 0) {
                remain = true;
                break;
            }
        }
        return remain;
    }
}