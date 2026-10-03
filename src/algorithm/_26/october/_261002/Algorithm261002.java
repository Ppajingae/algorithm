package algorithm._26.october._261002;

import java.util.Arrays;

public class Algorithm261002 {
    public int solution(int[][] routes) {
        int answer = 1;

        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

        int endPoint = routes[0][1];
        for (int[] route : routes) {
            if(endPoint >= route[0]) continue;
            else{
                answer++;
                endPoint = route[1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] routes = {
                {-20, -15},
                {-14, -5},
                {-18, -13},
                {-5, -3}
        };

        Algorithm261002 algo = new Algorithm261002();

        System.out.println(algo.solution(routes));
    }
}
