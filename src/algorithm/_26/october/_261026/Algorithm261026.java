package algorithm._26.october._261026;

import java.util.HashMap;
import java.util.Map;

public class Algorithm261026 {

    public int solution(String s) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);

        char[] sArr = s.toCharArray();
        String word = "";

        for (int i = 0; i < sArr.length; i++) {
            try {
                int number = Integer.parseInt(sArr[i] + "");
                answer += String.valueOf(number);
            }catch (Exception e){
                word += sArr[i] + "";
                if(map.containsKey(word)){
                    answer += map.get(word);
                    word = "";
                }
            }
        }


        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Algorithm261026 algorithm = new Algorithm261026();

        System.out.println(algorithm.solution("one4seveneight"));   // 1478
        System.out.println(algorithm.solution("23four5six7"));      // 234567
        System.out.println(algorithm.solution("2three45sixseven")); // 234567
        System.out.println(algorithm.solution("123"));              // 123
    }
}