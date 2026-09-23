package algorithm._26.september._260922;

public class Algorithm260922 {

    public static int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i <= wallpaper.length - 1; i++) {
            char[] str = wallpaper[i].toCharArray();
            for (int j = 0; j <= str.length - 1; j++) {
                if(str[j] == '#') {
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                }
            }
        }

        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
