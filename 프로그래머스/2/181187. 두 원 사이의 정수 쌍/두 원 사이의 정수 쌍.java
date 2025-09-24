class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        long border = 0;
        
        for(int i=1; i<=r2; i++) {
            long big = (long)Math.sqrt((long)Math.pow(r2, 2) - (long)Math.pow(i, 2));
            long small = (long)Math.sqrt((long)Math.pow(r1, 2) - (long)Math.pow(i, 2));
            
            long inner = (long)Math.pow(r1, 2) - (long)Math.pow(i, 2);
            if(inner > 0)  {
                long y = (long)Math.sqrt(inner);
                if(y * y == inner) border++;
            }

            answer += (big - small);
        }
        answer *= 4;
        answer += border * 4;
        answer += (r2 - r1 + 1) * 4;
        
        return answer;
    }
}