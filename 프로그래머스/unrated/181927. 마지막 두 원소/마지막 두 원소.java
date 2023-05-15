import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = Arrays.copyOf(num_list, l + 1);
        if(num_list[l-1] > num_list[l-2])
            answer[l] = num_list[l-1] - num_list[l-2];
        else
            answer[l] = num_list[l-1] * 2;
        return answer;
    }
}