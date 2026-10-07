package algorithm._26.october._261006._pend;

import java.util.Arrays;
import java.util.Objects;

public class Algorithm261006_Pend {
    public int solution(String arr[]) {
        int answer = -1;
        int numberCount = (arr.length / 2) + 1;
        int[][] max =  new int[numberCount][numberCount];
        int[][] min =  new int[numberCount][numberCount];

        for (int i = 0; i < numberCount; i++) {
            max[i][i] = Integer.parseInt(arr[i * 2]);
            min[i][i] = Integer.parseInt(arr[i * 2]);
        }

        for (int i = 2; i <= numberCount; i++) {

            for (int start = 0; start + i <= numberCount; start++) {

                int end = start + i - 1;

                for(int j = start; j < end; j++) {

                    int plusMaxData = Integer.MIN_VALUE;
                    int plusMinData = Integer.MAX_VALUE;
                    int minusMaxData = Integer.MIN_VALUE;
                    int minusMinData = Integer.MAX_VALUE;

                    if(Objects.equals(arr[j * 2 + 1], "+")){
                        plusMaxData = Math.max(Integer.parseInt(arr[start * 2]), Integer.parseInt(arr[j * 2])) + Math.max(Integer.parseInt(arr[(j + 1) * 2]), Integer.parseInt(arr[end * 2]));
                        plusMinData = Math.min(Integer.parseInt(arr[start * 2]), Integer.parseInt(arr[j * 2])) + Math.min(Integer.parseInt(arr[(j + 1) * 2]), Integer.parseInt(arr[end * 2]));
                    }else if(Objects.equals(arr[j * 2 + 1], "-")){
                        minusMaxData = Math.max(Integer.parseInt(arr[start * 2]), Integer.parseInt(arr[j * 2])) - Math.max(Integer.parseInt(arr[(j + 1) * 2]), Integer.parseInt(arr[end * 2]));
                        minusMinData = Math.min(Integer.parseInt(arr[start * 2]), Integer.parseInt(arr[j * 2])) - Math.min(Integer.parseInt(arr[(j + 1) * 2]), Integer.parseInt(arr[end * 2]));
                    }

                    max[start][end] = Math.max(plusMaxData, minusMaxData);
                    min[start][end] = Math.min(plusMinData, minusMinData);
                }
            }
        }

        System.out.println(Arrays.deepToString(max));
        System.out.println(Arrays.deepToString(min));
        return answer;
    }
    public static void main(String[] args) {

        String[] arr1 = {
                "1", "-", "3", "+", "5", "-", "8"
        };

        String[] arr2 = {
                "5", "-", "3", "+", "1", "+", "2", "-", "4"
        };

        Algorithm261006_Pend algo = new Algorithm261006_Pend();

        System.out.println(algo.solution(arr2));
    }
}
