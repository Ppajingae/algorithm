package algorithm._26.november._261122;

import java.util.Arrays;
import java.util.Collections;

public class Algorithm261122 {

    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");

        Arrays.sort(arr, Collections.reverseOrder());

        return Long.parseLong(String.join("",arr));
    }

    public static void main(String[] args) {
        Algorithm261122 algorithm = new Algorithm261122();

        long[] testCases = {
                118372L,
                1L,
                9L,
                10L,
                100L,
                12345L,
                98765L,
                11111L,
                909090L,
                8000000000L,
                1234567890L,
                1000000001L
        };

        long[] expected = {
                873211L,
                1L,
                9L,
                10L,
                100L,
                54321L,
                98765L,
                11111L,
                999000L,
                8000000000L,
                9876543210L,
                1100000000L
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