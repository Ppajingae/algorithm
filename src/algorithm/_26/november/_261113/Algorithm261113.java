package algorithm._26.november._261113;

public class Algorithm261113 {

    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if(getDivisors(nums[i] + nums[j] + nums[k]) == 2) {
                        answer++;
                    };
                }
            }
        }
        return answer;
    }

    int getDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Algorithm261113 algorithm = new Algorithm261113();

        int[][] testCases = {
                {1, 2, 3, 4},
                {1, 2, 7, 6, 4},
                {1, 2, 4},
                {1, 2, 3},
                {2, 4, 6},
                {1, 3, 5},
                {2, 3, 5, 7}
        };

        int[] expected = {
                1, 4, 1, 0, 0, 0, 0
        };

        for (int i = 0; i < testCases.length; i++) {
            int actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (actual == expected[i])
            );
        }
    }
}