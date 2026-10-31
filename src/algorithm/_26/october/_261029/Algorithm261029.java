package algorithm._26.october._261029;

public class Algorithm261029 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                answer += absolutes[i] * -1;
            } else{
                answer += absolutes[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261029 algorithm = new Algorithm261029();

        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};

        int[] absolutes2 = {1, 2, 3};
        boolean[] signs2 = {false, false, true};

        System.out.println(algorithm.solution(absolutes1, signs1)); // 9
        System.out.println(algorithm.solution(absolutes2, signs2)); // 0
    }
}