package algorithm._26.october._261022;

public class Algorithm261022 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm261022 solution = new Algorithm261022();

        System.out.println(solution.solution(10)); // 3
        System.out.println(solution.solution(12)); // 11
    }}
