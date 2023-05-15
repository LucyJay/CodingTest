import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for(String c : callings) {
            int idx = map.get(c);
            String pre = players[idx-1];
            map.replace(c, idx - 1);
            map.replace(pre, idx);
            players[idx-1] = c;
            players[idx] = pre;
        }

        return players;
    }
}