package algorithm._26.september._260928;

import java.util.*;

public class Algorithm260928 {

    public int solution(int n, int[][] wires) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        // 양방향 그래프 생성
        for (int i = 0; i < wires.length; i++) {
            map.computeIfAbsent(wires[i][0], k -> new ArrayList<>())
                    .add(wires[i][1]);

            map.computeIfAbsent(wires[i][1], k -> new ArrayList<>())
                    .add(wires[i][0]);
        }

        int answer = Integer.MAX_VALUE;

        // 전선을 하나씩 끊어본다.
        for (int i = 0; i < wires.length; i++) {

            int cutA = wires[i][0];
            int cutB = wires[i][1];

            boolean[] visited = new boolean[n + 1];

            // cutA에서 시작해서 도달 가능한 송전탑 개수
            int count = count(
                    cutA,
                    cutA,
                    cutB,
                    map,
                    visited
            );

            // 반대편 네트워크
            int otherCount = n - count;

            // 두 네트워크의 송전탑 개수 차이
            int diff = Math.abs(count - otherCount);

            answer = Math.min(answer, diff);
        }

        return answer;
    }

    private int count(
            int current,
            int cutA,
            int cutB,
            Map<Integer, List<Integer>> map,
            boolean[] visited
    ) {

        visited[current] = true;

        int count = 1;

        for (int next : map.get(current)) {

            // 이번에 끊었다고 가정한 전선이면 이동하지 않는다.
            if ((current == cutA && next == cutB)
                    || (current == cutB && next == cutA)) {
                continue;
            }

            // 이미 방문한 송전탑
            if (visited[next]) {
                continue;
            }

            count += count(
                    next,
                    cutA,
                    cutB,
                    map,
                    visited
            );
        }

        return count;
    }
}