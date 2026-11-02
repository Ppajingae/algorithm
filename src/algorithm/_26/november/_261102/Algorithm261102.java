package algorithm._26.november._261102;

import java.util.Arrays;

public class Algorithm261102 {

    public int[] solution(int[] numbers) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261102 algorithm = new Algorithm261102();

        int[][] numbers = {
                {2, 1, 3, 4, 1},
                {5, 0, 2, 7}
        };

        int[][] expected = {
                {2, 3, 4, 5, 6, 7},
                {2, 5, 7, 9, 12}
        };

        for (int i = 0; i < numbers.length; i++) {
            int[] result = algorithm.solution(numbers[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + Arrays.toString(result)
                            + " | 예상: " + Arrays.toString(expected[i])
                            + " | 통과: " + Arrays.equals(result, expected[i])
            );
        }
    }
}