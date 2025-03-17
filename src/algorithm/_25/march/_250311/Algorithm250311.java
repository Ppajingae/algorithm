package algorithm._25.march._250311;

import java.util.HashMap;
import java.util.Map;

public class Algorithm250311 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int answerSize = 0;
        Map<String, Integer> yearningMap = new HashMap<>();
        //name , yearing 을 Map 자료형 으로 Mapping

        for(int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }

        //photo 에 나오는 수만큼 Map 에서 찾아서 더하기

        for(int i = 0; i < photo.length; i++){
            int k = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(yearningMap.containsKey(photo[i][j])){
                    k += yearningMap.get(photo[i][j]);
                }
            }

            answer[answerSize] = k;
            answerSize++;
        }



        return answer;
    }

}
