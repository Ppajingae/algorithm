package algorithm._26.september._260920;

public class Algorithm260920 {

    public int solution(int[] schedules, int[][] timeLogs, int startDay) {

        // startDay == 6, 7 그냥 continue
        int answer = 0;
        for (int i = 0; i < schedules.length; i++) {

            int count = 0;
            for(int j = 0; j < timeLogs[i].length; j++) {

                int scheduleData = parseTime(schedules[i], 10);
//                System.out.println("timeLogData: " + timeLogData + " scheduleData: " + scheduleData + "  startDay : " + startDay);
                if(timeLogs[i][j] <= scheduleData || startDay == 6 || startDay == 7) {
                    count += 1;
                    if(startDay == 7) {
                        startDay = 0;
                    }
                }

//                System.out.println("count: " + count);
            }
            if(count == 7) {
                answer++;
            }
        }

        return answer;
    }

    private int parseTime(int time, int delayTime) {
        int hour = time / 100;
        int minute = (time % 100) + delayTime;

        if(minute >= 60){
            hour += 1;
            minute -= 60;
        }

        String minuteData = "";

        if(minute < 10){
            minuteData = "0" + minute;
        }else minuteData = "" + minute;

        return Integer.parseInt(hour + minuteData);
    }
}
