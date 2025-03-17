package algorithm._25.january._250118;

import java.util.Arrays;

public class Algorithm250118 {

    public int solution(int[] array, int height) {

        int answer = 0;

        for (int j : array) {
            if (j > height) answer++;
        }

        return answer;

    }

    public int triangle(int[] sides){
        int answer = 2;

        sides = Arrays.stream(sides).sorted().toArray();

        if(sides[0] + sides[1] > sides[2]) answer = 1;

        return answer;
    }
}
