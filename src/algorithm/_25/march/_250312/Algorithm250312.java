package algorithm._25.march._250312;

import java.util.*;

public class Algorithm250312 {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int answerIndex = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++){
            if(queue.size() >= k){
                if(queue.peek() < score[i]){
                    queue.poll();
                    queue.add(score[i]);
                }
            }else{
                queue.add(score[i]);
            }

            answer[answerIndex] = queue.peek();
            answerIndex++;
        }

        return answer;
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        //1 -> 2 -> 3 -> 1
        Stack<Integer> stack = new Stack<>();

        // linkedList로 하나씩 접근

        for(int i = 0; i < ingredient.length; i++){

            stack.push(ingredient[i]);

            if(stack.size() >= 4){
                if(stack.get(stack.size() - 4) == 1 &&
                        stack.get(stack.size() - 3) == 2 &&
                        stack.get(stack.size() - 2) == 3 &&
                        stack.get(stack.size() - 1) == 1){

                    for(int j = 0; j < 4; j++){
                        stack.pop();
                    }

                    answer++;
                }
            }

        }


        return answer;
    }
}
