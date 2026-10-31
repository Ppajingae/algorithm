package algorithm._26.october._261023;

import java.util.Arrays;

public class Algorithm261023 {

    public int solution(int[][] sizes) {
        int[] maxArr = new int[sizes.length];
        int[] minArr = new int[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            maxArr[i] = Math.max(sizes[i][0], sizes[i][1]);
            minArr[i] = Math.min(sizes[i][0], sizes[i][1]);
        }

        return Arrays.stream(maxArr).max().getAsInt() * Arrays.stream(minArr).max().getAsInt();
    }

    public static void main(String[] args) {
        Algorithm261023 algorithm = new Algorithm261023();

        int[][] sizes1 = {
                {60, 50}, {30, 70}, {60, 30}, {80, 40}
        };

        int[][] sizes2 = {
                {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}
        };

        int[][] sizes3 = {
                {14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}
        };

        System.out.println(algorithm.solution(sizes1)); // 4000
        System.out.println(algorithm.solution(sizes2)); // 120
        System.out.println(algorithm.solution(sizes3)); // 133
    }
}