package algorithm._26.september._260921;

import java.util.HashMap;
import java.util.Map;

public class Algorithm260921 {

    public String[] solution(String[] players, String[] callings) {

        Map<String,Integer> map = new HashMap<>();

        for (int j = 0; j < players.length; j++) {
            map.put(players[j], j);
        }

        for (String calling : callings) {

            int callingUserRank = map.get(calling);

            String firstPlayer = players[callingUserRank - 1];

            map.replace(firstPlayer, callingUserRank);
            map.replace(calling, callingUserRank - 1);

            players[callingUserRank - 1] = calling;
            players[callingUserRank] = firstPlayer;
        }

        return players;
    }
}
