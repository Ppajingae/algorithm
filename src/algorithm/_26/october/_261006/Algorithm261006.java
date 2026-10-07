package algorithm._26.october._261006;

import java.util.ArrayList;
import java.util.List;

public class Algorithm261006 {
    public String solution(String s, String skip, int index) {
        char[] arr = s.toCharArray();
        char[] skips = skip.toCharArray();
        List<Character> alphabet = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            alphabet.add((char) (i + 97));
        }

        for (char c : skips) {
            alphabet.remove(Character.valueOf(c));
        }

        for (int i = 0; i < arr.length; i++) {

            int indexNum = alphabet.indexOf(Character.valueOf(arr[i])) + index;

            indexNum = indexNum % (alphabet.size());

            arr[i] = alphabet.get(indexNum);
        }
        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;


        Algorithm261006 algo = new Algorithm261006();

        System.out.println(algo.solution(s, skip, index));
    }
}
