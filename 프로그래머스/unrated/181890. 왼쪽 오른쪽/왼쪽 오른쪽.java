import java.util.*;
class Solution {
    public List<String> solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        int lr = 0; // r이면 1
        for (String s : str_list) {
            if (lr == 0 && s.equals("l")) {
                return list;
            }
            if (lr == 0 && s.equals("r")) {
                lr = 1;
                list = new ArrayList<>();
                continue;
            }
            list.add(s);
        }
        if (lr == 0)
            return new ArrayList<>();
        else
            return list;
    }
}