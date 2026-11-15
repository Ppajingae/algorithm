package algorithm._26.november._261115;

import java.util.Arrays;

public class Algorithm261115 {

    public String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();

        for(int i = 0; i < arr.length - 4; i++){
           arr[i] = '*';
        }

        return String.valueOf(arr);
    }

    public boolean solution2(int x) {
        char[] numArr = String.valueOf(x).toCharArray();

        int result = 0;
        for (char c : numArr) {
            result += Integer.parseInt(String.valueOf(c));
        }

        return x % result == 0;
    }


    public static void main(String[] args) {
        Algorithm261115 algorithm = new Algorithm261115();

        String[] testCases = {
                "01033334444",
                "027778888",
                "1234",
                "12345",
                "01012345678",
                "12345678901234567890"
        };

        String[] expected = {
                "*******4444",
                "*****8888",
                "1234",
                "*2345",
                "*******5678",
                "****************7890"
        };

        for (int i = 0; i < testCases.length; i++) {
            String actual = algorithm.solution(testCases[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected[i]
                            + " | 통과: " + actual.equals(expected[i])
            );
        }

        int[] testCases2 = {
                10, 12, 11, 13,
                1, 18, 19, 21,
                100, 101, 9999, 10000
        };

        boolean[] expected2 = {
                true, true, false, false,
                true, true, false, true,
                true, false, true, true
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean actual = algorithm.solution2(testCases2[i]);

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 입력: " + testCases2[i]
                            + " | 결과: " + actual
                            + " | 예상: " + expected2[i]
                            + " | 통과: " + (actual == expected2[i])
            );
        }
    }
}