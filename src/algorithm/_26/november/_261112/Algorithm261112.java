package algorithm._26.november._261112;

import java.util.Arrays;

public class Algorithm261112 {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        for (int i : d) {
            count += i;
            if (count <= budget) {
                answer++;
            }else break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261112 algorithm = new Algorithm261112();

        int[][] dCases = {
                {1, 3, 2, 5, 4},
                {2, 2, 3, 3},
                {1},
                {5},
                {1, 1, 1, 1},
                {100000, 100000, 100000},
                {3, 3, 3}
        };

        int[] budgets = {
                9, 10, 1, 1, 2, 200000, 5
        };

        int[] expected = {
                3, 4, 1, 0, 2, 2, 1
        };

        for (int i = 0; i < dCases.length; i++) {
            int actual = algorithm.solution(
                    dCases[i],
                    budgets[i]
            );

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (actual == expected[i])
            );
        }
    }
}