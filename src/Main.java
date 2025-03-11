import algorithm._250120.Algorithm250120;
import algorithm._250121.Algorithm250121;
import algorithm._250122.Algorithm250122;
import algorithm._250131.Algorithm250131;
import algorithm._250206.Algorithm250206;
import algorithm._250311.Algorithm250311;
import algorithm._250312.Algorithm250312;

import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Algorithm250312 algorithm250312 = new Algorithm250312();


        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(algorithm250312.solution(k, score)));
        }
}