package algorithm._26.october._261015;

public class Algorithm261015 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] != 1){
                for (int j = 0; j < food[i] / 2; j++) {
                    answer.append(i);
                }
            }
        }

        return answer + "0" + answer.reverse();
    }

    public static void main(String[] args) {
        Algorithm261015 algo = new Algorithm261015();

        int[] food = {1, 3, 4, 6};

        int[] food2 = {1, 7, 1, 2};


        System.out.println(algo.solution(food2));
    }
}
