package algorithm._26.october._261024;

import java.util.ArrayList;
import java.util.List;

public class Algorithm261024 {

    public int solution(int[] numbers) {
        int answer = 0;
        int[] intArr = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        for (int i = 0; i < intArr.length; i++) {
            if (list.contains(intArr[i])) {
                continue;
            }else{
                answer += intArr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261024 algorithm = new Algorithm261024();

        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(algorithm.solution(numbers1)); // 14
        System.out.println(algorithm.solution(numbers2)); // 6
    }
}