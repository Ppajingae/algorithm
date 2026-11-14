package algorithm._26.november._261107;

import java.util.Arrays;

public class Algorithm261107 {

    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        int[] one = { 1, 2, 3, 4, 5 };
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answerCount = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                answerCount[0]++;
            }

            if (answers[i] == two[i % two.length]) {
                answerCount[1]++;
            }

            if (answers[i] == three[i % three.length]) {
                answerCount[2]++;
            }
        }

        int maxCount = Integer.MIN_VALUE;

        for (int i : answerCount) {
            if (i > maxCount) {
                maxCount = i;
            }
        }

        for (int i = 0; i < answerCount.length; i++) {
            if (answerCount[i] == maxCount) answer[i] = i + 1;
        }
        return Arrays.stream(answer)
                .filter(n -> n != 0)
                .toArray();
    }

    public static void main(String[] args) {
        Algorithm261107 algorithm = new Algorithm261107();

        int[][] testCases = {
                {1, 2, 3, 4, 5},
                {1, 3, 2, 4, 2}
        };

        int[][] expected = {
                {1},
                {1, 2, 3}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] result = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + Arrays.toString(result)
                            + " | 예상: " + Arrays.toString(expected[i])
                            + " | 통과: " + Arrays.equals(result, expected[i])
            );
        }
    }
}