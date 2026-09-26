package algorithm._26.september._260925;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm260925 {

    List<int[]> answer = new ArrayList<>();

    public int[][] solution(int n) {

        move(n, 1, 3, 2);

        return answer.toArray(new int[0][]);
    }

    List<int[]> move(int n, int from, int to, int via) {
        if(n == 0) return answer;

        move(n - 1, from, via, to);

        answer.add(new int[] {from, to});

        move(n - 1, via, to, from);

        return answer;
    }

    public static void main(String[] args) {
        Algorithm260925 algo = new Algorithm260925();

        System.out.println(Arrays.deepToString(algo.solution(3)));
    }
}
