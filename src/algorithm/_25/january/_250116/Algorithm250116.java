package algorithm._25.january._250116;

public class Algorithm250116 {

    public int solution(int n, int k) {

        int cnt = n / 10;
        if(k < cnt){
            k = 0;
            cnt = 0;
        }

        return (n * 12000) + (k * 2000) - (cnt * 2000);

    }

    public int dotLocation(int[] dot) {

        if (dot[0] > 0 && dot[1] > 0) return 1;
        if (dot[0] < 0 && dot[1] > 0) return 2;
        if (dot[0] < 0 && dot[1] < 0) return 3;
        if (dot[0] > 0 && dot[1] < 0) return 4;
        return 0;
    }
}
