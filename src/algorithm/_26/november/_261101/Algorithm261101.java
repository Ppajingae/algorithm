package algorithm._26.november._261101;

public class Algorithm261101 {

    public long solution(int n) {
        long answer = 0;
        StringBuilder answerStr = new StringBuilder();
        while (n > 0) {
            answerStr.append(n % 3);
            n = n / 3;
        }

        int j = 0;
        for(int i = answerStr.length() - 1; i >= 0; i--) {

            if(i != 0) {
                answer += (long) Math.pow(3, i) * Integer.parseInt(String.valueOf(answerStr.charAt(j)));
            } else{
                answer += Long.parseLong(String.valueOf(answerStr.charAt(j)));
            }

            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261101 algorithm = new Algorithm261101();

        int[] numbers = {45, 125};
        int[] expected = {7, 229};

        for (int i = 0; i < numbers.length; i++) {
            long result = algorithm.solution(numbers[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: " + numbers[i]
                            + " | 결과: " + result
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (result == expected[i])
            );
        }
    }
}