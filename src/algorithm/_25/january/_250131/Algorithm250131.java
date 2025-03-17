package algorithm._25.january._250131;

public class Algorithm250131 {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }

}
