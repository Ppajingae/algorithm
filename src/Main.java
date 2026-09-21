import algorithm._25.march._250318.Algorithm250318;
import algorithm._26.september._260920.Algorithm260920;
import algorithm._26.september._260921.Algorithm260921;

import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Algorithm260921 algorithm260921 = new Algorithm260921();


        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(algorithm260921.solution(players, callings)));
        }
}