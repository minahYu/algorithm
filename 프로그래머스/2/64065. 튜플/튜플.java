import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        List<List<Integer>> sList = new ArrayList<>();
        List<Integer> sNums = null;
             
        s = s.substring(1, s.length()-1);
        boolean finish = false;
        String num = "";
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num += ch;
            }
            
            if(ch == '{') {
                sNums = new ArrayList<Integer>();
            }
            
            if(finish && ch == ',') {
                finish = false;
                sList.add(sNums);
            }
            
            if((!finish && ch == ',') || ch == '}') {
                if(num != "") sNums.add(Integer.parseInt(num));
                num = "";
                
                if(ch == '}') {
                    finish = true;
                }
            }
        } 
        sList.add(sNums);
        
        Collections.sort(sList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> list1, List<Integer> list2) {
                return Integer.compare(list1.size(), list2.size());
            }
        });
        
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<sList.size(); i++) {
            List<Integer> list = sList.get(i);
            
            for(int j=0; j<list.size(); j++) {
                set.add(list.get(j));
            }
        }
        
        int[] answer = new int[set.size()];
        int i=0;
        Iterator<Integer> iterSet = set.iterator();
        while(iterSet.hasNext()) {
            answer[i] = iterSet.next();
            i++;
        }
        
        return answer;
    }
}