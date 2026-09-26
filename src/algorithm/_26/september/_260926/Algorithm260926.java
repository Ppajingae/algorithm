package algorithm._26.september._260926;

import java.util.Arrays;

public class Algorithm260926 {
    public int solution(int[][] triangle) {
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if(j == 0){
                    triangle[i][j] = triangle[i - 1][0] + triangle[i][j];
                } else if(j == triangle[i].length - 1){
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i][j];
                }else {
                    triangle[i][j] = triangle[i][j] + Math.max(triangle[i - 1][j - 1],triangle[i - 1][j]);
                }
            }
        }

        return Arrays.stream(triangle[triangle.length - 1])
                .max()
                .getAsInt();
    }

    public static void main(String[] args) {
        Algorithm260926 algorithm = new Algorithm260926();

        int[][] triangle = {
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}
        };

        System.out.println(algorithm.solution(triangle));
    }
}
