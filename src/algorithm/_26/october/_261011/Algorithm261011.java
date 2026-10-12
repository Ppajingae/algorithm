package algorithm._26.october._261011;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm261011 {
    public int[] solution(int n, int s) {
        int[] 정답 = new int[n];
        int 몫 = s / n;
        int 나머지 = s % n;
        if(몫 != 0){
            for (int i = n - 1; i >= 0; i--) {
                if(나머지 != 0){
                    정답[i] = 몫 + 1;
                    나머지 -= 1;
                }else {
                    정답[i] = 몫;
                }
            }
        } else{
            return new int[]{-1};
        }

        return 정답;
    }

    public static void main(String[] args) {
        Algorithm261011 algo = new Algorithm261011();

        int 숫자 = 2;
        int 원소 = 9;
        int 숫자2 = 2;
        int 원소2 = 8;
        int 숫자3 = 2;
        int 원소3 = 1;
        int 숫자4 = 4;
        int 원소4 = 9;

        System.out.println(Arrays.toString(algo.solution(숫자4, 원소4))); // 3
    }
}
