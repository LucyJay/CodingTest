import java.util.stream.*;
import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int cnt = 0;
        char[] chars = myString.toCharArray();
        for(char ch : chars) {
            if(ch == 'x') {
                answer.add(cnt);
                cnt = 0;
            }
            else
                cnt++;
        }
        if(myString.endsWith("x"))
            answer.add(0);
        else
            answer.add(cnt);
       return answer;
    }
}