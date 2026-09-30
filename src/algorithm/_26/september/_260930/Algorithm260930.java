package algorithm._26.september._260930;

import java.util.Arrays;

public class Algorithm260930 {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int smallWallet = Math.min(wallet[0], wallet[1]);
        int bigWallet = Math.max(wallet[0], wallet[1]);
        int smallBill = Math.min(bill[0], bill[1]);
        int bigBill = Math.max(bill[0], bill[1]);

        while (bigWallet < bigBill || smallWallet < smallBill) {
            bigBill = bigBill / 2;
            if(smallBill > bigBill) {
                int temp = smallBill;
                smallBill = bigBill;
                bigBill = temp;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] wallet1 = {30, 15};
        int[] wallet2 = {50, 50};

        int[] bill1 = {26, 17};
        int[] bill2 = {100, 241};


        Algorithm260930 algo = new Algorithm260930();

        System.out.println(algo.solution(wallet2, bill2));
    }
}
