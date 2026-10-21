package algorithm._26.october._261021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithm261021 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] sanctions = new int[id_list.length];
        Map<String, ArrayList<String>> reporterMap = new HashMap<>();
        Map<String, ArrayList<String>> respondentMap = new HashMap<>();
        Map<String, Integer> idList = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idList.put(id_list[i], i);
        }

        for (String s : id_list) {
            reporterMap.put(s, new ArrayList<>(4));
            respondentMap.put(s, new ArrayList<>(4));
        }

        for (String s : report) {
            String reporter= s.split(" ")[0];
            String respondent= s.split(" ")[1];

            if(reporterMap.get(reporter).contains(respondent)){
                continue;
            }

            reporterMap.get(reporter).add(respondent);
            respondentMap.get(respondent).add(reporter);

        }

        respondentMap.forEach((s, list) -> {
            if(list.size() >= k){
                for (String reporter : list) {
                    sanctions[idList.get(reporter)]++;
                }
            }
        });
        

        return sanctions;
    }

    public static void main(String[] args) {
        Algorithm261021 solution = new Algorithm261021();

//        int[] result1 = solution.solution(
//                new String[]{"muzi", "frodo", "apeach", "neo"},
//                new String[]{
//                        "muzi frodo",
//                        "apeach frodo",
//                        "frodo neo",
//                        "muzi neo",
//                        "apeach muzi"
//                },
//                2
//        );
//
//        int[] result2 = solution.solution(
//                new String[]{"con", "ryan"},
//                new String[]{
//                        "ryan con",
//                        "ryan con",
//                        "ryan con",
//                        "ryan con"
//                },
//                3
//        );

        String[] id_list = {"a", "b", "c", "d"};

        int[] result3 = solution.solution(
                new String[]{"a", "b", "c", "d"},
                new String[]{
                        "a d",
                        "b d",
                        "c d"
                },
                2
        );


//        System.out.println(Arrays.toString(result1)); // [2, 1, 1, 0]
//        System.out.println(Arrays.toString(result2)); // [0, 0]
        System.out.println(Arrays.toString(result3));
    }
}
