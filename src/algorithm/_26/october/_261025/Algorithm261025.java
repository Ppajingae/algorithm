package algorithm._26.october._261025;

public class Algorithm261025 {

    public long solution(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i++){
            answer += (long) price * i;
        }
        return answer > money ? answer - money : 0;
    }

    public static void main(String[] args) {
        Algorithm261025 algorithm = new Algorithm261025();

        System.out.println(algorithm.solution(3, 20, 4)); // 10
        System.out.println(algorithm.solution(3, 30, 4)); // 0
        System.out.println(algorithm.solution(3, 40, 4)); // 0
    }
}