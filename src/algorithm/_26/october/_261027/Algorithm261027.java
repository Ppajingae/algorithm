package algorithm._26.october._261027;

public class Algorithm261027 {

    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            if(getDivisors(i) % 2 == 0){
                answer += i;
            }else{
                answer -= i;
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
        Algorithm261027 algorithm = new Algorithm261027();

        System.out.println(algorithm.solution(13, 17)); // 43
        System.out.println(algorithm.solution(24, 27)); // 52
    }
}