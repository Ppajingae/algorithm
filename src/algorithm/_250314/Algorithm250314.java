package algorithm._250314;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithm250314 {

    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();


        for (String x : X.split("")) {
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
        }

        for (String y : Y.split("")) {
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }

        for(String key: xMap.keySet()){
            if(!yMap.containsKey(key)) continue;

            int length = Math.min(yMap.get(key), xMap.get(key));

            for(int i = 0; i < length; i++){
                list.add(key);
            }
        }

        //collect(Collectors.joining()) 로 String 변환
        String str = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());

        if(str.isEmpty()) {
            return "-1";
        }else if(str.replaceAll("0", "").isEmpty()){
            return "0";
        }else return str;
    }
}
