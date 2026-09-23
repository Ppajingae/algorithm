package algorithm._26.september._260923;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithm260923 {

    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int rollerLocation = 0;

       for (int i = 0; i < section.length; i++) {
           if(section[i] <= rollerLocation) continue;
           for (int j = 0; j < m; j++) {
               rollerLocation = j + section[i];
           }
           answer++;
       }

        return answer;
    }

}
