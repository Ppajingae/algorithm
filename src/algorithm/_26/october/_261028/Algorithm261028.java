package algorithm._26.october._261028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Algorithm261028 {

    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> score = new HashMap<>();
        int count = win_nums.length;
        for (int i = 1; i < win_nums.length; i++) {
            score.put(count , i);
            count--;
        }

        ArrayList<Integer> sortedLotto = Arrays.stream(lottos)
                .boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> sortedWinNums = Arrays.stream(win_nums)
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        int zeroCount = 0;
        int matchPoint = 0;

        for (Integer lotto : sortedLotto) {
            if (lotto == 0) {
                zeroCount++;
            } else if (sortedWinNums.contains(lotto)) {
                matchPoint++;
            }
        }

        return new int[]{score.getOrDefault(matchPoint + zeroCount, 6), score.getOrDefault(matchPoint, 6)};
    }

    public static void main(String[] args) {
        Algorithm261028 algorithm = new Algorithm261028();

        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] winNums1 = {31, 10, 45, 1, 6, 19};

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] winNums2 = {38, 19, 20, 40, 15, 25};

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] winNums3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(
                algorithm.solution(lottos1, winNums1)
        )); // [3, 5]

        System.out.println(Arrays.toString(
                algorithm.solution(lottos2, winNums2)
        )); // [1, 6]

        System.out.println(Arrays.toString(
                algorithm.solution(lottos3, winNums3)
        )); // [1, 1]
    }
}