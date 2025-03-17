package algorithm._25.march._250313;

public class Algorithm250313 {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        // 하나씩 지우는 느낌으로 다시 정의
        for (int i = 0; i < babbling.length; i++) {

            //연속되는 구간은 우선 예외 처리
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") ||  babbling[i].contains("mama")){ continue; }

            for (String word : words) {
                babbling[i] = babbling[i].replace(word, " ");
            }

            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}
