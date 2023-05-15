import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for (int j = 0; j < photo.length; j++) {
            int score = 0;
            for (int k = 0; k < photo[j].length; k++) {
                if(map.get(photo[j][k]) != null)
                 score += map.get(photo[j][k]);
            }
            answer[j] = score;
        }
        return answer;
    }
}