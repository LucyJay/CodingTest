import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int a = (l % 5 == 0) ? l : l + (5 - l % 5);
        for(int i = a; i <= r; i += 5) {
            String s = "" + i;
            if(s.indexOf("1") == -1 && s.indexOf("2") == -1 && s.indexOf("3") == -1 && s.indexOf("4") == -1 && s.indexOf("6") == -1 && s.indexOf("7") == -1 && s.indexOf("8") == -1 && s.indexOf("9") == -1)
                list.add(i);
        }
        int[] answer;
        if (list.size() > 0) {
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else
            answer = new int[]{-1};
        return answer;
    }
}