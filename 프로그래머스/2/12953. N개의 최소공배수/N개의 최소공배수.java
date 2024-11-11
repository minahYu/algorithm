class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        if(arr.length == 1) {
            answer = arr[0]; 
        } else {            
            int gcd = gcd(arr[0], arr[1]);
            int lcm = lcm(arr[0], arr[1], gcd);
            
            for(int i=2; i<arr.length; i++) {
                gcd = gcd(lcm, arr[i]);
                lcm = lcm(lcm, arr[i], gcd);
            }
            answer = lcm;
        }
        
        return answer;
    }
    
    private static int gcd(int a, int b) {
        while(a%b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    private static int lcm(int a, int b, int gcd) {
        return a * b / gcd;
    }
}