package algorithm._26.october._261009;


import java.util.*;

public class Algorithm261009 {
    public int[] solution(String s) {

        Map<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], i);
                answer[i] = -1;
            } else{
                int value = map.get(arr[i]);
                answer[i] = i - value;
                map.put(arr[i], i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "foobar";

        Algorithm261009 algo = new Algorithm261009();

        System.out.println(Arrays.toString(algo.solution(s)));
    }
}
