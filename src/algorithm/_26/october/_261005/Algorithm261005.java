package algorithm._26.october._261005;

public class Algorithm261005 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int card1Index = 0;
        int card2Index = 0;

        for (String s : goal) {
            if(card1Index < cards1.length &&cards1[card1Index].equals(s)){
                card1Index++;
            }else if(card2Index < cards2.length && cards2[card2Index].equals(s)){
                card2Index++;
            }else return "No";

        }

        return "Yes";
    }

    public static void main(String[] args) {

        String[] cards1 = {
                "i",
                "drink",
                "water"
        };

        String[] cards2 = {
                "want",
                "to"
        };

        String[] goal = {
                "i",
                "want",
                "to",
                "drink",
                "water"
        };
        Algorithm261005 algo = new Algorithm261005();

        System.out.println(algo.solution(cards1, cards2, goal));
    }
}
