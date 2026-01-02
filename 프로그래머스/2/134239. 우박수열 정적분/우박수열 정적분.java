import java.util.ArrayList;
import java.util.List;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Double> hailstone = new ArrayList<>();
        
        double num = k;
        hailstone.add(num);
        while(num > 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            hailstone.add(num);
        }
        
        double[] area = new double[hailstone.size()];
        for(int i=0; i<area.length-1; i++) {
            area[i+1] = area[i] + (hailstone.get(i) + hailstone.get(i+1)) / 2;
        }
        
        int len = area.length - 1;
        for(int i=0; i<ranges.length; i++) {     
            int a = ranges[i][0];
            int b = ranges[i][1];
            
            int end = (b > 0) ? b : len + b;
            
            if(a > end) {
                answer[i] = -1;
            } else {
                answer[i] = area[end] - area[a];
            }
        }
        
        return answer;
    }
}