class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String burger = "1231";
        
        for(int one : ingredient) {
            sb.append(one);
            
            if(sb.length() >= 4) {
                if(sb.substring(sb.length()-4, sb.length()).equals(burger)) {
                    answer++;
                    sb.delete(sb.length()-4, sb.length());
                } 
            }
        }
        
        return answer;
    }
}