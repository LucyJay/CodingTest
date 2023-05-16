import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        Set<String> set = new HashSet<>();
        for (int i = 1; i < length + 1; i++) {
            set.add(my_string.substring(length - i));
        }
        String[] answer = new String[set.size()];
        Iterator it = set.iterator();
        int idx = 0;
        while(it.hasNext()) {
            answer[idx++] = (String)it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}