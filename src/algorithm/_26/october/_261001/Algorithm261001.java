package algorithm._26.october._261001;

import java.util.*;

public class Algorithm261001 {
    public int solution(int n, int[][] edge) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n + 1];

        return bfs(visited, graph);
    }

    private int bfs(boolean[] visited, ArrayList<ArrayList<Integer>> list) {
        Queue<int[]> q = new ArrayDeque<>();
        int farthest = 0;
        int count = 0;
        q.offer(new int[] {1 , 0});

        visited[1] = true;

        while(!q.isEmpty()) {
            int[] poll = q.poll();

            for(int search : list.get(poll[0])) {

                if(!visited[search]) {
                    q.offer(new int[] {search, poll[1]+1});

                    visited[search] = true;
                }
            }
            if(farthest < poll[1]) {
                farthest = poll[1];
                count = 0;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 6;

        int[][] vertex = {
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}
        };

        Algorithm261001 algo = new Algorithm261001();

        System.out.println(algo.solution(n, vertex));
    }
}
