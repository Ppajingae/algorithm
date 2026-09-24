import algorithm._25.march._250318.Algorithm250318;
import algorithm._26.september._260920.Algorithm260920;
import algorithm._26.september._260921.Algorithm260921;
import algorithm._26.september._260923.Algorithm260923;
import algorithm._26.september._260924.Algorithm260924;

import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Algorithm260924 algorithm260924 = new Algorithm260924();

        int n = 6;
        int s = 4;
        int a = 5;
        int b = 6;
        int[][] fares1 = {
                {4, 1, 10},
                {3, 5, 24},
                {5, 6, 2},
                {3, 1, 41},
                {5, 1, 24},
                {4, 6, 50},
                {2, 4, 66},
                {2, 3, 22},
                {1, 6, 25}
        };

        int[][] fares2 = {
                {5, 7, 9},
                {4, 6, 4},
                {3, 6, 1},
                {3, 2, 3},
                {2, 1, 6}
        };

        int[][] fares3 = {
                {2, 6, 6},
                {6, 3, 7},
                {4, 6, 7},
                {6, 5, 11},
                {2, 5, 12},
                {5, 3, 20},
                {2, 4, 8},
                {4, 3, 9}
        };
        System.out.println(algorithm260924.solution(n,s,a,b,fares3));
        }
}