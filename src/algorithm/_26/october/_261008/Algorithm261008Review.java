package algorithm._26.october._261008;

import java.util.*;

public class Algorithm261008Review {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] ints : edge) {
            int a = ints[0];
            int b = ints[1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        return bfs(visited, graph);
    }

    private int bfs(boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        Queue<int[]> q = new ArrayDeque<>();
        int start = 0;
        int count = 0;
        q.offer(new int[]{1, 0});

        visited[1] = true;

        while(!q.isEmpty()) {
            int[] poll = q.poll();

            for (Integer i : graph.get(poll[0])) {
                if(!visited[i]) {
                    q.offer(new int[]{i, poll[1] + 1});

                    visited[i] = true;
                }
            }
            if (start < poll[1]){
                start = poll[1];
                count = 0;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 6;
        int[][] edge = {
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}
        };
        Algorithm261008Review algo = new Algorithm261008Review();

        System.out.println(algo.solution(n, edge));
    }
}
