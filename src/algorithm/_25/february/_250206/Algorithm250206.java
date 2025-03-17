package algorithm._25.february._250206;

public class Algorithm250206 {

    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                if(even == 0){
                    even = i;
                }else{
                    String tmpStr = String.valueOf(even);
                    String iStr = String.valueOf(i);
                    even = Integer.parseInt(tmpStr + iStr);
                }
            }else{
                if(odd == 0){
                    odd = i;
                }else{
                    String tmpStr = String.valueOf(odd);
                    String iStr = String.valueOf(i);
                    odd = Integer.parseInt(tmpStr + iStr);
                }
            }
        }

        return odd + even;
    }

}
