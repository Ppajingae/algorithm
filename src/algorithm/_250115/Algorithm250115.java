package algorithm._250115;

import java.util.*;

public class Algorithm250115 {

    public int solution(int a, int b, int c, int d) {

        int[] tmpArr = {a,b,c,d};

        Arrays.sort(tmpArr);

        if(tmpArr[0] == tmpArr[3]) {
            return  1111 * a;
        }if(tmpArr[0] == tmpArr[2] || tmpArr[1] == tmpArr[3]){
            return (int)Math.pow(tmpArr[1] * 10 + (tmpArr[0] + tmpArr[3] - tmpArr[1]), 2);
        }if(tmpArr[0] == tmpArr[1] || tmpArr[1] == tmpArr[2] || tmpArr[2] == tmpArr[3]){
            if(tmpArr[0] == tmpArr[1] && tmpArr[2] == tmpArr[3]){
                return (tmpArr[0] + tmpArr[2]) * Math.abs(tmpArr[0] - tmpArr[2]);
            }else{
                if(tmpArr[0] == tmpArr[1]) return tmpArr[2] * tmpArr[3];
                if(tmpArr[1] == tmpArr[2]) return tmpArr[0] * tmpArr[3];
                return tmpArr[0] * tmpArr[1];
            }
        }else{
            return tmpArr[0];
        }

    }
}
