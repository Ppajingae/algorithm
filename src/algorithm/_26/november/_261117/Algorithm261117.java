package algorithm._26.november._261117;

public class Algorithm261117 {

    public int solution(int num) {
        int answer = 0;
        long longNum = num;

        while (longNum != 1){
            longNum = (longNum % 2 == 0) ? longNum / 2 : (longNum * 3) + 1;
            answer++;
            if (answer >= 500) return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261117 algorithm = new Algorithm261117();

        int[] testCases = {
                6,
                16,
                626331,
                1,
                2,
                3,
                4,
                5,
                8,
                10
        };

        int[] expected = {
                8,
                4,
                -1,
                0,
                1,
                7,
                2,
                5,
                3,
                6
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