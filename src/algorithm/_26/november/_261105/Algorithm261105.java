package algorithm._26.november._261105;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithm261105 {

    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int count = 0;
        int stageLength = stages.length;

        for (int i = 1; i <= N; i++) {
            for (int stage : stages) {
                if(stage == i){
                    count++;
                }
            }
            double totalCount = 0.0;
            if(count > 0) totalCount = (double) count / stageLength;
            map.put(i, totalCount);
            stageLength = stageLength - count;
            count = 0;
        }


        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                )).keySet().stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Algorithm261105 algorithm = new Algorithm261105();

        int[] stageCounts = {5, 4, 5,4,5};

        int[][] stages = {
                {2, 1, 2, 6, 2, 4, 3, 3},
                {4, 4, 4, 4, 4},
                {1, 1, 1},
                {1, 2, 3, 4, 5},
                {6, 6, 6}
        };

        int[][] expected = {
                {3, 4, 2, 1, 5},
                {4, 1, 2, 3},
                {1, 2, 3, 4, 5},
                {4, 3, 2, 1},
                {1, 2, 3, 4, 5}
        };
        for (int i = 0; i < stageCounts.length; i++) {
            int[] result = algorithm.solution(stageCounts[i], stages[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + Arrays.toString(result)
                            + " | 예상: " + Arrays.toString(expected[i])
                            + " | 통과: " + Arrays.equals(result, expected[i])
            );
        }
    }
}