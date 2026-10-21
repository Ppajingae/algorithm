package algorithm._26.october._261016;

import java.util.Stack;

public class Algorithm261016 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama") ){
                continue;
            }

            for (String word : words) {
                s = s.replace(word," ");
            }

            s = s.replace(" ","");

            if(s.isEmpty()) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm261016 algo = new Algorithm261016();

        String[] babbling = {"aya", "yee", "u", "maa"};
        String[] babbling1 = {
                "aya",
                "ayaye",
                "yeaya",
                "woo",
                "mama",
                "woowo",
                "yeye"
        };
        String[] babbling2 = {
                "ayaye",
                "uuu",
                "yeye",
                "yemawoo",
                "ayaayaa"
        };


        System.out.println(algo.solution(babbling2));
    }
}
