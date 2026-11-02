package algorithm._26.november._261102;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algorithm261102 {

    public List<Integer> solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i ++){
            for (int j = i; j < numbers.length - 1; j ++){
                set.add(numbers[i] + numbers[j + 1]);
            }
        }

        return set.stream().sorted().toList();
    }

    public static void main(String[] args) {
        Algorithm261102 algorithm = new Algorithm261102();

        int[][] numbers = {
                {2, 1, 3, 4, 1},
                {5, 0, 2, 7}
        };

        int[][] expected = {
                {2, 3, 4, 5, 6, 7},
                {2, 5, 7, 9, 12}
        };

        for (int i = 0; i < numbers.length; i++) {
            List<Integer> result = algorithm.solution(numbers[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + result
                            + " | 예상: " + Arrays.toString(expected[i])
            );
        }
    }
}