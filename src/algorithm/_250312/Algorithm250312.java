package algorithm._250312;

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
}
