package algorithm._250117;

public class Algorithm250117 {

    public int solution(int[] num_list, int n) {

        int answer = 0;

        for (int j : num_list) {
            if (j == n) {
                answer = 1;
                break;
            }
        }
        return answer;

    }

    public String containsString(String[] str_list, String ex){

        String answer = "";

        for (String s : str_list) {

            if (!s.contains(ex)) {
                answer += s;
            }
        }

        return answer;
    }
}
