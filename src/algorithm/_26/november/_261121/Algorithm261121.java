package algorithm._26.november._261121;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm261121 {

    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return sqrt % 1 == 0 ? (long) Math.pow((sqrt + 1), 2) : -1L;
    }

    public static void main(String[] args) {
        Algorithm261121 algorithm = new Algorithm261121();

        long[] testCases = {
                121L,
                3L,
                1L,
                4L,
                9L,
                16L,
                25L,
                100L,
                101L,
                1000000L,
                1000000000000L,
                49999999999999L,
                50000000000000L
        };

        long[] expected = {
                144L,
                -1L,
                4L,
                9L,
                16L,
                25L,
                36L,
                121L,
                -1L,
                1002001L,
                1000002000001L,
                -1L,
                -1L
        };

        for (int i = 0; i < testCases.length; i++) {
            long actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: " + testCases[i]
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (actual == expected[i])
            );
        }
    }
}