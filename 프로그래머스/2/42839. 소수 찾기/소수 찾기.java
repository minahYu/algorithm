import java.util.Set;
import java.util.HashSet;

class Solution {
    private static Set<Integer> set;
    private static boolean[] visited;
    private static int[] numArr;
    private static int[] pick;
    
    public int solution(String numbers) {
        int answer = 0;
        numArr = new int[numbers.length()];
        visited = new boolean[numbers.length()];
        pick = new int[numbers.length()];
        
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = numbers.charAt(i) - '0';
        }
        
        set = new HashSet<>();
        for(int i=1; i<=numArr.length; i++) {
            dfs(0, i);
        }

        for(int num : set) {
            if(isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n%2 == 0) return n == 2;
        
        for(int i=3; i*i<=n; i+=2) {
            if(n%i == 0) return false;
        }
        
        return true;
    }
    
    private static void dfs(int depth, int i) {
        if(depth == i) {
            int num = 0;
            for(int j=0; j<i; j++) {
                num = num * 10 + pick[j];
            }
            set.add(num);
            return;
        }
        
        for(int j=0; j<numArr.length; j++) {
            if(visited[j]) continue;
           
            visited[j] = true;
            pick[depth] = numArr[j];
            dfs(depth+1, i);
            visited[j] = false;
        }
    }
}