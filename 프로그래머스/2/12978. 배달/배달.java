import java.util.*;

class Solution {
    static class Node implements Comparable<Node> {
        int idx;
        int dist;
        
        public Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
        
        @Override
        public int compareTo(Node node2) {
            return Integer.compare(this.dist, node2.dist);
        }
    }
    
    private static List<Node>[] graph;
    private static int[] distances;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        distances = new int[N+1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[1] = 0;
        
        for(int i=0; i<road.length; i++) {
            int a = road[i][0], b = road[i][1];
            int dist = road[i][2];
            
            graph[a].add(new Node(b, dist));
            graph[b].add(new Node(a, dist));
        }
        
        dijkstra(1);
        
        for(int i=1; i<=N; i++) {
            if(distances[i] <= K) answer++;
        }

        return answer;
    }
    
    private static void dijkstra(int idx) {
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(new Node(idx, 0));
        
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            
            if(cur.dist > distances[cur.idx]) continue;
            
            for(Node next : graph[(cur.idx)]) {
                int sum = next.dist + distances[cur.idx];
                
                if(sum < distances[next.idx]) {
                    distances[next.idx] = sum;
                    queue.add(new Node(next.idx, sum));
                }
            }
        }
    }
}