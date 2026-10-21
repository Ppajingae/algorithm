package algorithm._26.october._261013;

public class Algorithm261013 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int result = getDivisors(i);
            if (result > limit) {
                answer += power;
            }else {
                answer = answer + result;
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
        Algorithm261013 algo = new Algorithm261013();

        int number = 5;
        int limit = 3;
        int power = 2;

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;

        System.out.println(algo.solution(number, limit, power)); // 3
    }
}
