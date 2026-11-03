package algorithm._26.november._261103;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithm261103 {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        String leftButton = "*";
        String rightButton = "#";

        for (int number : numbers) {
            String strNumber = String.valueOf(number);
            switch (number) {
                case 1,4,7:
                    answer.append("L");
                    leftButton = strNumber;
                    break;
                case 2,5,8,0:
                    if(getDistance(rightButton, strNumber)
                            == getDistance(leftButton, strNumber)){
                        if(hand.equals("left")) {
                            leftButton = strNumber;
                            answer.append("L");
                        }else{
                            rightButton = strNumber;
                            answer.append("R");
                        }
                    }else if(getDistance(rightButton, strNumber)
                            < getDistance(leftButton, strNumber)) {
                        rightButton = strNumber;
                        answer.append("R");
                    } else{
                        leftButton = strNumber;
                        answer.append("L");
                    }
                    break;
                case 3,6,9:
                    answer.append("R");
                    rightButton = strNumber;
            }
        }

        return answer.toString();
    }

    public int getDistance(String button, String clickedButton) {
        int distance = 0;
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("*", List.of(3,0));
        map.put("0", List.of(3,1));
        map.put("#", List.of(3,2));
        map.put("1", List.of(0,0));
        map.put("2", List.of(0,1));
        map.put("3", List.of(0,2));
        map.put("4", List.of(1,0));
        map.put("5", List.of(1,1));
        map.put("6", List.of(1,2));
        map.put("7", List.of(2,0));
        map.put("8", List.of(2,1));
        map.put("9", List.of(2,2));

        List<Integer> point = map.get(button);
        List<Integer> point1 = map.get(clickedButton);

        for (int i = 0; i < point.size(); i++) {
            distance += Math.abs(Math.abs(point.get(i)) - Math.abs(point1.get(i)));
        }

        return distance;
    }
    public static void main(String[] args) {
        Algorithm261103 algorithm = new Algorithm261103();

        int[][] numbers = {
                {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},
                {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
        };

        String[] hands = {
                "right",
                "left",
                "right"
        };

        String[] expected = {
                "LRLLLRLLRRL",
                "LRLLRRLLLRR",
                "LLRLLRLLRL"
        };

        for (int i = 0; i < numbers.length; i++) {
            String result = algorithm.solution(numbers[i], hands[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + result
                            + " | 예상: " + expected[i]
                            + " | 통과: " + result.equals(expected[i])
            );
        }
    }
}