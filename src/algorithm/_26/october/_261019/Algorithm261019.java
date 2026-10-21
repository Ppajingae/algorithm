package algorithm._26.october._261019;

public class Algorithm261019 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm261019 solution = new Algorithm261019();

        int result1 = solution.solution(
                new int[]{-2, 3, 0, 2, -5}
        );

        int result2 = solution.solution(
                new int[]{-3, -2, -1, 0, 1, 2, 3}
        );

        int result3 = solution.solution(
                new int[]{-1, 1, -1, 1}
        );

        System.out.println(result1); // 2
        System.out.println(result2); // 5
        System.out.println(result3); // 0
    }
}
