package algorithm._26.october._261007;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Algorithm261007 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {

            String[] command = operation.split(" ");

            if(command[0].equals("I")){
                minQueue.offer(Integer.parseInt(command[1]));
                maxQueue.offer(Integer.parseInt(command[1]));
            } else if(command[0].equals("D")){
                if(command[1].equals("-1")){
                    if(!minQueue.isEmpty()){
                        int data = minQueue.peek();
                        maxQueue.remove(data);
                    }
                    minQueue.poll();
                } else if(command[1].equals("1")){
                    if(!maxQueue.isEmpty()){
                        int data = maxQueue.peek();
                        minQueue.remove(data);
                    }
                    maxQueue.poll();
                }

            }
        }

        if(minQueue.isEmpty() && maxQueue.isEmpty()){
            return new int[2];
        }else{
            return new int[]{maxQueue.peek(), minQueue.peek()};
        }
    }

    public static void main(String[] args) {

        String[] operations = {
                "I 16",
                "I -5643",
                "D -1",
                "D 1",
                "D 1",
                "I 123",
                "D -1"
        };

        String[] operationsT = {
                "I 16",
                "I -5643",
                "D -1",
        };

        String[] operations2 = {
                "I -45",
                "I 653",
                "D 1",
                "I -642",
                "I 45",
                "I 97",
                "D 1",
                "D -1",
                "I 333"
        };

        Algorithm261007 algo = new Algorithm261007();

        System.out.println(Arrays.toString(algo.solution(operations2)));
    }
}
