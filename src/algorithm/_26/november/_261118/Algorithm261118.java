package algorithm._26.november._261118;

import java.util.Arrays;

public class Algorithm261118 {

    public int[] solution(int n, int m) {
        int first = n;
        int second = m;

        while (second != 0){
            int temp = first % second;

            first = second;
            second = temp;
        }

        long longData = ((long) n * m) / (long) first;
        return new int[]{first, Math.toIntExact(longData)};
    }

    public static void main(String[] args) {
        Algorithm261118 algorithm = new Algorithm261118();

        int[][] testCases = {
                {3, 12},
                {2, 5},
                {1, 1},
                {1, 10},
                {6, 8},
                {12, 18},
                {7, 7},
                {15, 25},
                {100, 200},
                {1000000, 1000000}
        };

        int[][] expected = {
                {3, 12},
                {1, 10},
                {1, 1},
                {1, 10},
                {2, 24},
                {6, 36},
                {7, 7},
                {5, 75},
                {100, 200},
                {1000000, 1000000}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] actual = algorithm.solution(
                    testCases[i][0],
                    testCases[i][1]
            );

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + Arrays.toString(actual)
                            + " | 예상: " + Arrays.toString(expected[i])
                            + " | 통과: " + Arrays.equals(actual, expected[i])
            );
        }
    }
}