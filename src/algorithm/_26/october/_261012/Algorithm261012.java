package algorithm._26.october._261012;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Algorithm261012 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        answer[0] = score[0];
        pq.offer(score[0]);
        for (int i = 1; i < score.length; i++){
            if(pq.size() < k){
                pq.offer(score[i]);
            }else if(pq.peek() < score[i] && pq.size() > k - 1){
                pq.poll();
                pq.offer(score[i]);
            }else if(pq.peek() > score[i] && pq.size() > k - 1){
                answer[i] = pq.peek();
                continue;
            }
            answer[i] = pq.peek();
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm261012 algo = new Algorithm261012();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        int k3 = 3;
        int[] score3 = {100, 90, 80, 70, 60, 50, 40};
        System.out.println(Arrays.toString(algo.solution(k, score))); // 3
    }
}
