import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        BigInteger numerator = BigInteger.valueOf(balls);
        BigInteger denominator = BigInteger.valueOf(share);
        
        for(int i=1; i<share; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(balls-i));
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }
        
        answer = (numerator.divide(denominator)).intValue();
        
        return answer;
    }
}