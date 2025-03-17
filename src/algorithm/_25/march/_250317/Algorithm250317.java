package algorithm._25.march._250317;

import java.util.*;

public class Algorithm250317 {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 여기서 mapping 을 잘못함
        Map<String, Integer> reportMap = new HashMap<>();
        //신고 횟수를 카운팅 하는 Map 구성
        Map<String, HashSet<String>> reportCountMap = new HashMap<>();

        for(int i=0; i<id_list.length;i++){
            reportMap.put(id_list[i],i);
            reportCountMap.put(id_list[i],new HashSet<>());
        }



        for (String str : report){
            // String 분리
            String[] split = str.split(" ");

            reportCountMap.get(split[1]).add(split[0]);
        }

        //신고 횟수가 k번 이상인 맴버만 Map 에서 추려서 반복문을 돌려서 카운팅

        for (int  i = 0; i < id_list.length; i++) {
                HashSet<String> set = reportCountMap.get(id_list[i]);
                if(set.size() >= k){
                    for(String s : set){
                        answer[reportMap.get(s)]++;
                    }
                }
        }



        return answer;
    }
}
