package algorithm._26.october._261020;

import java.util.HashMap;
import java.util.Map;

public class Algorithm261020 {
    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> map = new HashMap<>();

        char[] mbti = new char[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (int i = 0; i < mbti.length; i++) {
            map.put(mbti[i], 0);
        }

        for (int i = 0; i < choices.length; i++) {

            var number = choices[i] - 4;

            char[] type = survey[i].toCharArray();

            if(number < 0){
                map.replace(type[0], map.get(type[0]) + Math.abs(number));
            }else if(number > 0){
                map.replace(type[1], map.get(type[1]) + Math.abs(number));
            }
        }

        return returningString('R','T', map)
                + returningString('C', 'F', map)
                + returningString('J','M', map)
                + returningString('A', 'N', map);

    }

    public String returningString(char char1, char char2, Map<Character, Integer> map) {
        int char1Value = map.get(char1);
        int char2Value = map.get(char2);

        if(char1Value < char2Value) return String.valueOf(char2);
        else if(char1Value > char2Value) return String.valueOf(char1);
        else {
            if(String.valueOf(char1).compareTo(String.valueOf(char2)) > 0){
                return String.valueOf(char2);
            }else return String.valueOf(char1);
        }
    }

    public static void main(String[] args) {
        Algorithm261020 solution = new Algorithm261020();

        String result1 = solution.solution(
                new String[]{"AN", "CF", "MJ", "RT", "NA"},
                new int[]{5, 3, 2, 7, 5}
        );

        String result2 = solution.solution(
                new String[]{"TR", "RT", "TR"},
                new int[]{7, 1, 3}
        );

        System.out.println(result1); // TCMA
        System.out.println(result2); // RCJA
    }
}
