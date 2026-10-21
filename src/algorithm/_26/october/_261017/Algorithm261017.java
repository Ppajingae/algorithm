package algorithm._26.october._261017;

import java.util.Stack;

public class Algorithm261017 {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            if(stack.size() >= 4){
                if(stack.get(stack.size() - 4) == 1 &&
                        stack.get(stack.size() - 3) == 2 &&
                        stack.get(stack.size() - 2) == 3 &&
                        stack.getLast() == 1){
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261017 algo = new Algorithm261017();

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};


        System.out.println(algo.solution(ingredient));
    }
}
