import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0) {
            answer = cities.length * 5;
            return answer;
        }
        
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
        }   
        
        LinkedList<String> cache = new LinkedList<>();
        for(int i=0; i<cities.length; i++) {
            if(cache.size() < cacheSize) {
                if(!cache.contains(cities[i])) {
                    cache.addFirst(cities[i]);
                    answer += 5;
                } else {
                    cache.remove(cache.indexOf(cities[i]));
                    cache.addFirst(cities[i]);
                    answer += 1;
                }
            } else {
                if(!cache.contains(cities[i])) {
                    cache.removeLast();
                    cache.addFirst(cities[i]);
                    answer += 5;
                } else {
                    cache.remove(cache.indexOf(cities[i]));
                    cache.addFirst(cities[i]);
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}