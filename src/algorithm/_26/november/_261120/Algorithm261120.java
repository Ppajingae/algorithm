package algorithm._26.november._261120;

import java.util.*;

public class Algorithm261120 {

    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : arr) {
            arrayList.add(i);
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) < min){
                min = arrayList.get(i);
                index = i;
            }
        }

        arrayList.remove(index);
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        Algorithm261120 algorithm = new Algorithm261120();

        int[][] testCases = {
                {4, 3, 2, 1},
                {10},
                {1, 2, 3, 4},
                {5, 1, 3, 2, 4},
                {-3, -1, -2},
                {0, -5, 10},
                {7, 3},
                {3, 7},
                {-1},
                {0}
        };

        int[][] expected = {
                {4, 3, 2},
                {-1},
                {2, 3, 4},
                {5, 3, 2, 4},
                {-1, -2},
                {0, 10},
                {7},
                {7},
                {-1},
                {-1}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: " + Arrays.toString(testCases[i])
                            + " | 결과: " + Arrays.toString(actual)
                            + " | 예상: " + Arrays.toString(expected[i])
                            + " | 통과: " + Arrays.equals(actual, expected[i])
            );
        }
    }
}