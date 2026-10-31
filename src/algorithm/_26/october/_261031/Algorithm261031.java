package algorithm._26.october._261031;


public class Algorithm261031 {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261031 algorithm = new Algorithm261031();

        int[][] a = {
                {1, 2, 3, 4},
                {-1, 0, 1}
        };

        int[][] b = {
                {-3, -1, 0, 2},
                {1, 0, -1}
        };

        int[] expected = {3, -2};

        for (int i = 0; i < a.length; i++) {
            int result = algorithm.solution(a[i], b[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + result
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (result == expected[i])
            );
        }
    }
}