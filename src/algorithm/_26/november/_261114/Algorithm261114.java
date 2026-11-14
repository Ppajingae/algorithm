package algorithm._26.november._261114;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm261114 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++){
            answer[i] = (long) (i + 1) * x;
        }
        return answer;
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Algorithm261114 algorithm = new Algorithm261114();

        int[][] testCases = {
                {2, 5},
                {4, 3},
                {-4, 2},
                {0, 5},
                {5, 1},
                {-3, 4},
                {10000000, 3}
        };

        long[][] expected = {
                {2L, 4L, 6L, 8L, 10L},
                {4L, 8L, 12L},
                {-4L, -8L},
                {0L, 0L, 0L, 0L, 0L},
                {5L},
                {-3L, -6L, -9L, -12L},
                {10000000L, 20000000L, 30000000L}
        };

        for (int i = 0; i < testCases.length; i++) {
            long[] actual = algorithm.solution(
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

        int[][][] arr1Cases = {
                {{1, 2}, {2, 3}},
                {{1}, {2}},
                {{0}},
                {{-1, 2}, {3, -4}},
                {{1, 2, 3}},
                {{1}, {2}, {3}}
        };

        int[][][] arr2Cases = {
                {{3, 4}, {5, 6}},
                {{3}, {4}},
                {{0}},
                {{5, -2}, {-3, 4}},
                {{4, 5, 6}},
                {{4}, {5}, {6}}
        };

        int[][][] expected2 = {
                {{4, 6}, {7, 9}},
                {{4}, {6}},
                {{0}},
                {{4, 0}, {0, 0}},
                {{5, 7, 9}},
                {{5}, {7}, {9}}
        };

        for (int i = 0; i < arr1Cases.length; i++) {
            int[][] actual = algorithm.solution(arr1Cases[i], arr2Cases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + Arrays.deepToString(actual)
                            + " | 예상: " + Arrays.deepToString(expected2[i])
                            + " | 통과: " + Arrays.deepEquals(actual, expected2[i])
            );
        }

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        // 여기에 구현
//
//        for (int i = 0; i < m; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        scanner.close();
    }
}