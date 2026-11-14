package algorithm._26.november._261108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm261108 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j - 1]);
            }

            List<Integer> sortedArr = list.stream().sorted().toList();
            int result = sortedArr.get(commands[i][2] - 1);
            answer[i] = result;
            list.clear();
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261108 algorithm = new Algorithm261108();

        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        int[] expected = {5, 6, 3};

        int[] actual = algorithm.solution(array, commands);

        System.out.println(
                "결과: " + Arrays.toString(actual)
                        + " | 예상: " + Arrays.toString(expected)
                        + " | 통과: " + Arrays.equals(actual, expected)
        );
    }
}