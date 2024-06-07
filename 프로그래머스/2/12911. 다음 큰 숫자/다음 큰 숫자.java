class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String binaryN = String.valueOf(Integer.toBinaryString(n));
        int num1Count = changeBinary(binaryN);
        
        while(num1Count != count) {
            n++;
            String binaryNNext = String.valueOf(Integer.toBinaryString(n));
            count = changeBinary(binaryNNext);
        }
        answer = n;
        
        return answer;
    }
    
    public int changeBinary(String binaryN) {
        int count = 0;
        for(char num : binaryN.toCharArray()) {
            if(num == '1')
                count++;
        }
        return count;
    }
}