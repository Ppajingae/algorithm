package algorithm._26.september._260929;

import java.util.Arrays;

public class Algorithm260929 {

    public int[] solution(int[][] arr) {
        int row = arr[0].length;

        int[] answerList = {0,0};
        int[] answer = something(arr,answerList,0, 0, row);

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        return answer;
    }

    private int[] something(int[][] arr, int[] answerList, int row, int col, int size){

        int standard = arr[row][col];
        boolean checked = false;
        for (int i = row; i < row + size; i ++) {
            for (int j = col; j < col + size;  j ++) {
                if(standard != arr[i][j]){
                    checked = true;
                    break;
                }
            }
        }

        if(checked){
            int half = size / 2;
            something(arr, answerList, row,  col, half);
            something(arr, answerList, row,  col + half, half);
            something(arr, answerList, row + half,  col, half);
            something(arr, answerList, row + half,  col + half, half);

        }else{
            if(arr[row][col] == 1){
                answerList[1]++;
            }else{
                answerList[0]++;
            }
        }

        return answerList;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 1, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };

        int[][] arr2 = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 1, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 1, 1, 1}
        };

        Algorithm260929 algo = new Algorithm260929();

        System.out.println(Arrays.toString(algo.solution(arr1)));
    }
}
