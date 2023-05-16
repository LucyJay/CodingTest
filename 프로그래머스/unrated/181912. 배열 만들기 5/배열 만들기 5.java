import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs) {
            String st = str.substring(s, s + l);
            int i = Integer.parseInt(st);
            if(i > k)
                list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int idx = 0; idx < list.size(); idx++) {
            answer[idx] = list.get(idx);
        }
        return answer;
    }
}