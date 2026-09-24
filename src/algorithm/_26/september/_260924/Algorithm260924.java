package algorithm._26.september._260924;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Algorithm260924 {

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int INF = Integer.MAX_VALUE;
        int answer = INF;

        ArrayList<ArrayList<Node>> fareNodes = new ArrayList<>();
        int[] dist = new int[n + 1];

        Arrays.fill(dist, INF);

        for (int i = 0; i <= n; i++) {
            fareNodes.add(new ArrayList<>());
        }

        for (int[] fare : fares) {
            fareNodes.get(fare[0]).add(
                    new Node(fare[1], fare[2])
            );
            fareNodes.get(fare[1]).add(
                    new Node(fare[0], fare[2])
            );
        }

        dist[s] = 0;
        int[] result = dijkstra(n, s, fareNodes, dist);

        Arrays.fill(dist, INF);
        dist[a] = 0;
        int[] result2 = dijkstra(n, a, fareNodes, dist);


        Arrays.fill(dist, INF);
        dist[b] = 0;
        int[] result3 = dijkstra(n, b, fareNodes, dist);

        for(int k = 1; k <= n; k++){
            if(result[k] + result2[k] + result3[k] < answer){
                answer = result[k] + result2[k] + result3[k];
            }
        }

        return answer;
    }

    private int[] dijkstra(int n, int s, ArrayList<ArrayList<Node>> fareNodes, int[] dist) {
        boolean[] check = new boolean[n + 1];
        int[] result = dist.clone();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));

        while (!pq.isEmpty()) {
            int nowVertex = pq.poll().index;
            if (check[nowVertex]) continue;
            check[nowVertex] = true;

            for (Node next : fareNodes.get(nowVertex)) {
                if (result[next.index] > result[nowVertex] + next.cost) {
                    result[next.index] = result[nowVertex] + next.cost;

                    pq.offer(new Node(next.index, result[next.index]));
                }
            }
        }

        return result;
    }
}
