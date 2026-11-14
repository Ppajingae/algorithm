package algorithm._26.november._261111;

import java.util.Arrays;

public class Algorithm261111 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            int binary = arr1[i];
            int binary2 = arr2[i];

            String result = Integer.toBinaryString(binary | binary2);
            if(result.length() != n){
                result = "0".repeat(Math.max(0, n - result.length())) + result;
            }
            String replace  = result.replace("1", "#").replace("0", " ");

            answer[i] = replace;
        }

        return answer;
    }

    public long solution2(int a, int b) {
        long answer = 0;

        if(a < b){
            for(int i = a; i <= b; i++){
                answer = answer + i;
            }
        }else if(a > b){
            for(int i = b; i <= a; i++){
                answer = answer + i;
            }
        }else {
            return a;
        }


        return answer;
    }

    public static void main(String[] args) {
        Algorithm261111 algorithm = new Algorithm261111();

        int[] sizes = {5, 6};

        int[][] arr1Cases = {
                {9, 20, 28, 18, 11},
                {46, 33, 33, 22, 31, 50}
        };

        int[][] arr2Cases = {
                {30, 1, 21, 17, 28},
                {27, 56, 19, 14, 14, 10}
        };

        String[][] expected = {
                {
                        "#####",
                        "# # #",
                        "### #",
                        "#  ##",
                        "#####"
                },
                {
                        "######",
                        "###  #",
                        "##  ##",
                        " #### ",
                        " #####",
                        "### # "
                }
        };

        for (int i = 0; i < sizes.length; i++) {
            String[] actual = algorithm.solution(
                    sizes[i],
                    arr1Cases[i],
                    arr2Cases[i]
            );

            System.out.println("테스트 " + (i + 1));
            System.out.println("결과: " + Arrays.toString(actual));
            System.out.println("예상: " + Arrays.toString(expected[i]));
            System.out.println(
                    "통과: " + Arrays.equals(actual, expected[i])
            );
            System.out.println();
        }

        int[][] testCases = {
                {3, 5},
                {3, 3},
                {5, 3},
                {-3, 3},
                {-5, -3},
                {-10000000, 10000000}
        };

        long[] expected2 = {
                12L, 3L, 12L, 0L, -12L, 0L
        };

        for (int i = 0; i < testCases.length; i++) {
            long actual = algorithm.solution2(
                    testCases[i][0],
                    testCases[i][1]
            );

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + actual
                            + " | 예상: " + expected2[i]
                            + " | 통과: " + (actual == expected2[i])
            );
        }
    }


}