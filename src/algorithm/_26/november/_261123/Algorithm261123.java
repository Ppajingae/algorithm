package algorithm._26.november._261123;

import java.util.Arrays;
import java.util.Collections;

public class Algorithm261123 {

    public int[] solution(long n) {
        char[] nArr = String.valueOf(n).toCharArray();
        int[] arr = new int[nArr.length];
        int index = 0;
        for (int i = nArr.length - 1; 0 <= i; i--){
            arr[index] = nArr[i] - '0';
            index++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Algorithm261123 algorithm = new Algorithm261123();

        long[] testCases = {
                12345L,
                1L,
                9L,
                10L,
                100L,
                1200L,
                987654321L,
                11111L,
                909090L,
                10000000000L,
                1234567890L
        };

        int[][] expected = {
                {5, 4, 3, 2, 1},
                {1},
                {9},
                {0, 1},
                {0, 0, 1},
                {0, 0, 2, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 1, 1, 1, 1},
                {0, 9, 0, 9, 0, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 9, 8, 7, 6, 5, 4, 3, 2, 1}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: " + testCases[i]
                            + " | 결과: " + Arrays.toString(actual)
                            + " | 예상: " + Arrays.toString(expected[i])
                            + " | 통과: " + Arrays.equals(actual, expected[i])
            );
        }
    }
}