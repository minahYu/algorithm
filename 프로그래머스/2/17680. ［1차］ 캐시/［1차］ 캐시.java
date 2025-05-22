import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        LinkedList<String> cache = new LinkedList<>();

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.contains(city)) {
                cache.remove(city);
                cache.addLast(city);
                answer += 1;
            } else {
                if (cacheSize > 0 && cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
                
                if (cacheSize > 0) {
                    cache.addLast(city);
                }
                answer += 5;
            }
        }
        
        return answer;
    }
}