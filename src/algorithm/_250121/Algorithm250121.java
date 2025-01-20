package algorithm._250121;

import java.util.List;

public class Algorithm250121 {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> s2List = List.of(s2);

        for (String s : s1) {
            if (s2List.contains(s)) {
                answer++;
            }
        }

        return answer;
    }
}
