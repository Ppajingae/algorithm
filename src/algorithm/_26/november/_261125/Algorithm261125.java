package algorithm._26.november._261125;

import java.util.Arrays;

public class Algorithm261125 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] split = s.split(" ", -1);
        for (int i = 0; i < split.length; i++){
            char[] data = split[i].toCharArray();

            for(int j = 0; j < data.length; j++){
                if((j + 1) % 2 == 0){
                    answer.append(Character.toLowerCase(data[j]));
                }else{
                    answer.append(Character.toUpperCase(data[j]));
                }
            }
            answer.append(" ");
        }
        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String[] args) {
        Algorithm261125 algorithm = new Algorithm261125();

        String[] testCases = {
                "try hello world",
                "hello",
                "HELLO",
                "a",
                "A",
                "ab cd ef",
                "abc defg",
                "try  hello   world",
                " hello",
                "hello ",
                "  hello  world  ",
                "hElLo WoRlD",
                "a b c d"
        };

        String[] expected = {
                "TrY HeLlO WoRlD",
                "HeLlO",
                "HeLlO",
                "A",
                "A",
                "Ab Cd Ef",
                "AbC DeFg",
                "TrY  HeLlO   WoRlD",
                " HeLlO",
                "HeLlO ",
                "  HeLlO  WoRlD  ",
                "HeLlO WoRlD",
                "A B C D"
        };

        for (int i = 0; i < testCases.length; i++) {
            String actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: \"" + testCases[i] + "\""
                            + " | 결과: \"" + actual + "\""
                            + " | 예상: \"" + expected[i] + "\""
                            + " | 통과: " + expected[i].equals(actual)
            );
        }
    }
}