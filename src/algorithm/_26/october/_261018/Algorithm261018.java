package algorithm._26.october._261018;

public class Algorithm261018 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a){
            answer += (n / a) * b;
            n =  ((n / a) * b) + n % a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm261018 algo = new Algorithm261018();

        int a = 2;
        int b = 1;
        int n = 20;

        int a2 = 3;
        int b2 = 2;
        int n2 = 20;


        System.out.println(algo.solution(a2,b2,n2));
    }
}
