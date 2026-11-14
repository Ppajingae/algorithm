package algorithm._26.november._261109;

import java.util.*;

public class Algorithm261109 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        return map.keySet().stream().filter(key -> map.getOrDefault(key, 0) == 1).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        Algorithm261109 algorithm = new Algorithm261109();

        String[][] participantCases = {
                {"leo", "kiki", "eden"},
                {"marina", "josipa", "nikola", "vinko", "filipa"},
                {"mislav", "stanko", "mislav", "ana"}
        };

        String[][] completionCases = {
                {"eden", "kiki"},
                {"josipa", "filipa", "marina", "nikola"},
                {"stanko", "ana", "mislav"}
        };

        String[] expected = {
                "leo",
                "vinko",
                "mislav"
        };

        for (int i = 0; i < participantCases.length; i++) {
            String actual = algorithm.solution(
                    participantCases[i],
                    completionCases[i]
            );

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + expected[i].equals(actual)
            );
        }
    }
}