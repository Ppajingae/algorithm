package algorithm._26.november._261116;

public class Algorithm261116 {

    public double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
        Algorithm261116 algorithm = new Algorithm261116();

        int[][] testCases = {
                {1, 2, 3, 4},
                {5, 5},
                {1},
                {0, 0, 0},
                {-1, -2, -3},
                {-10, 10},
                {1, 2},
                {10000, -10000, 5000}
        };

        double[] expected = {
                2.5,
                5.0,
                1.0,
                0.0,
                -2.0,
                0.0,
                1.5,
                1666.6666666666667
        };

        for (int i = 0; i < testCases.length; i++) {
            double actual = algorithm.solution(testCases[i]);

            boolean passed = Math.abs(actual - expected[i]) < 1e-9;

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + passed
            );
        }
    }
}