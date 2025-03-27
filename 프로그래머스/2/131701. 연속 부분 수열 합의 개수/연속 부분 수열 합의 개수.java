import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<elements.length; i++) {
            for(int start=0; start<elements.length; start++) {
                int sum = 0;
                for(int j=0; j<i; j++) {
                    sum += elements[(start+j)%elements.length];
                }
                set.add(sum);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}