package algorithm._26.november._261119;

import java.util.Arrays;

public class Algorithm261119 {

    public String solution(int num) {

        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Algorithm261119 algorithm = new Algorithm261119();

        int[] testCases = {
                3,
                4,
                0,
                1,
                2,
                -1,
                -2,
                -3,
                -4,
                1000000,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE
        };

        String[] expected = {
                "Odd",
                "Even",
                "Even",
                "Odd",
                "Even",
                "Odd",
                "Even",
                "Odd",
                "Even",
                "Even",
                "Odd",
                "Even"
        };

        for (int i = 0; i < testCases.length; i++) {
            String actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: " + testCases[i]
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + actual.equals(expected[i])
            );
        }
    }
}