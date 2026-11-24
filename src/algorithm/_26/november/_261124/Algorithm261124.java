package algorithm._26.november._261124;

public class Algorithm261124 {

    public int solution(int n) {
        int answer = 0;

        char[] nArr = String.valueOf(n).toCharArray();

        for (char c : nArr) {
            answer += Character.getNumericValue(c);
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261124 algorithm = new Algorithm261124();

        int[] testCases = {
                123,
                987,
                1,
                9,
                10,
                100,
                12345,
                11111,
                909090,
                1002003,
                99999999,
                100000000
        };

        int[] expected = {
                6,
                24,
                1,
                9,
                1,
                1,
                15,
                5,
                27,
                6,
                72,
                1
        };

        for (int i = 0; i < testCases.length; i++) {
            int actual = algorithm.solution(testCases[i]);

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