package algorithm._26.october._261014;

import java.util.Arrays;
import java.util.Collections;

public class Algorithm261014 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        for (int i = score.length; i >= 0; i++) {}


        return answer;
    }

    public static void main(String[] args) {
        Algorithm261014 algo = new Algorithm261014();

        int result1 = algo.solution(
                3,
                4,
                new int[]{1, 2, 3, 1, 2, 3, 1}
        );

        int result2 = algo.solution(
                4,
                3,
                new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}
        );

        System.out.println(result2);
    }
}
