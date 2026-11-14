package algorithm._26.november._261106;

import java.util.*;

public class Algorithm261106 {

    public int solution(int n, int[] lost, int[] reserve) {

        int[] numArray = new int[n];
        Arrays.fill(numArray, 1);

        int[] sortedLost = Arrays.stream(lost).sorted().toArray();
        int[] sortedReserve = Arrays.stream(reserve).sorted().toArray();
        int len = 0;
        int resLen = 0;

        for(int i = 1; i <= n; i++) {
            if(resLen >= reserve.length){
                resLen = 0;
            }
            if(len >= lost.length){
                len = 0;
            }

            if(sortedReserve[resLen] == i){
                numArray[sortedReserve[resLen] - 1] += 1;

                resLen++;
            }
            if(sortedLost[len] == i){
                numArray[sortedLost[len] - 1] -= 1;
                len++;
            }
        }

        for(int i = 0; i < numArray.length; i++){
            if(i == 0){
                if(numArray[i] == 2 && numArray[1] == 0){
                    numArray[i] -= 1;
                    numArray[1] += 1;
                }
                continue;
            }
            if(i == numArray.length - 1){
                if(numArray[i] == 2 && numArray[i - 1] == 0){
                    numArray[i] -= 1;
                    numArray[i - 1] += 1;
                }
                continue;
            }

            if(numArray[i] == 2 && numArray[i - 1] == 0){
                numArray[i] -= 1;
                numArray[i - 1] += 1;
            }else if(numArray[i] == 2 && numArray[i + 1] == 0){
                numArray[i] -= 1;
                numArray[i + 1] += 1;
            }
        }

        return Arrays.stream(numArray).filter(i -> i >= 1).toArray().length;
    }

    public static void main(String[] args) {
        Algorithm261106 algorithm = new Algorithm261106();

        int[] studentCounts = {5, 5, 3};

        int[][] lostCases = {
                {2, 4},
                {2, 4},
                {3}
        };

        int[][] reserveCases = {
                {1, 3, 5},
                {3},
                {1}
        };

        int[] expected = {5, 4, 2};

        for (int i = 0; i < studentCounts.length; i++) {
            int result = algorithm.solution(
                    studentCounts[i],
                    lostCases[i],
                    reserveCases[i]
            );

            System.out.println(
                    "테스트 " + (i + 1)
                            + " | 결과: " + result
                            + " | 예상: " + expected[i]
                            + " | 통과: " + (result == expected[i])
            );
        }
    }
}