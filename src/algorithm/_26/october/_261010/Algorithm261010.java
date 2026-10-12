package algorithm._26.october._261010;

import java.util.*;

public class Algorithm261010 {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        char first = arr[0];
        int firstCount = 0;
        int secondCount = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if(flag){
                first = arr[i];
                flag = false;
            }

            if(first == arr[i]){
                firstCount++;
            }

            if(arr[i] != first){
                secondCount++;
            }

            if(firstCount == secondCount || i == s.length() - 1){
                answer += 1;
                firstCount = 0;
                secondCount = 0;
                flag = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261010 solution = new Algorithm261010();

        String s = "banana";
        String s2 = "abracadabra";
        String s3 = "aaabbaccccabba";


        System.out.println(solution.solution(s)); // 3
    }
}
