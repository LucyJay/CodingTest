import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOf(Arrays.copyOfRange(num_list, n, num_list.length), num_list.length);
        for (int i = 0; i < n; i++) {
            answer[num_list.length - n + i] = num_list[i];
        }
        return answer;
    }
}