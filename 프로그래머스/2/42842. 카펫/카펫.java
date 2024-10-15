class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = brown + yellow;
        
        for(int height = 1; height <= Math.sqrt(n); height++) {
            if(n % height == 0) {
                int width = n / height;  

                if(width >= height && (width + height) * 2 - 4 == brown) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }

        }
        
        return answer;
    }
}