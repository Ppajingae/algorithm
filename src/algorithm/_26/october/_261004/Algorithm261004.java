package algorithm._26.october._261004;

public class Algorithm261004 {
    public int solution(int n, int[] money) {
        int[] count = new int[n + 1];
        count[0] = 1;
        for (int i = 0; i < money.length; i++) {
            for (int j = money[i]; j < count.length; j++) {
                count[j] += count[j - money[i]];
            }
        }

        return count[n] % 1_000_000_007;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] money = {1, 2, 5};
        Algorithm261004 algo = new Algorithm261004();

        System.out.println(algo.solution(n, money));
    }
}
