package algorithm._26.november._261110;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Algorithm261110 {

    public int solution(String dartResult) {
        Queue<Character> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= 3; i++){
            map.put(i, map.getOrDefault(i, 0));
        }

        for (char c : dartResult.toCharArray()) {
            queue.offer(c);
        }

        int count = 1;
        while (!queue.isEmpty()) {
            String score = queue.poll().toString();
            if(score.equals("1")){
                char next = queue.peek();
                if(next == '0'){
                    score += next;
                    queue.poll();
                }
            }
            char bonus = queue.poll();
            switch (bonus) {
                case 'S': map.replace(count ,(int) Math.pow(Integer.parseInt(score), 1)); break;
                case 'D': {
                    map.replace(count, (int) Math.pow(Integer.parseInt(score), 2)); break;
                }
                case 'T': map.replace(count ,(int) Math.pow(Integer.parseInt(score), 3)); break;
            }
            if (queue.isEmpty()) break;
            char option = queue.peek();
            if (Character.isDigit(option)) {
                count++;
                continue;
            };

            switch (option) {
                case '*': {
                    map.replace(count, map.get(count) * 2);
                    if(count != 1){
                        map.replace(count - 1, map.get(count - 1) * 2);
                    }
                    break;
                }
                case '#':
                    map.replace(count, map.get(count) * -1); break;
            }
            queue.poll();
            count++;
        }
        int answer = map.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        return answer;
    }

    public static void main(String[] args) {
        Algorithm261110 algorithm = new Algorithm261110();

        String[] testCases = {
                "1S2D*3T",
                "1D2S#10S",
                "1D2S0T",
                "1S*2T*3S",
                "1D#2S*3S",
                "1T2D3D#",
                "1D2S3T*"
        };

        int[] expected = {
                37, 9, 3, 23, 5, -4, 59
        };

        for (int i = 0; i < testCases.length; i++) {
            int actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (actual == expected[i])
            );
        }
    }
}