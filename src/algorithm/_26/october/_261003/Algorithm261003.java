package algorithm._26.october._261003;

public class Algorithm261003 {
    public int solution(String t, String p) {
        int answer = 0;

        char[] chars = t.toCharArray();
        for (int i = 0; i < t.length() - p.length() + 1; i++) {

            StringBuilder targetData = new StringBuilder();
            for (int j = i; j < p.length() + i; j++) {
                targetData.append(chars[j]);
            }

            if(targetData.length() != p.length()) break;
            if((Long.parseLong(targetData.toString()) <= Long.parseLong(p))) answer++;

        }

        return answer;
    }

    public static void main(String[] args) {

        String t = "3141592";
        String p = "271";

        String t2 = "500220839878";
        String p2 = "7";

        String t3 = "10203";
        String p3 = "15";
        Algorithm261003 algo = new Algorithm261003();

        System.out.println(algo.solution(t3, p3));
    }
}
