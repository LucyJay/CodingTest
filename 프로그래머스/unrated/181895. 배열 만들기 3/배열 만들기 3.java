import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] a = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] b = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        int[] answer = Arrays.copyOf(a, a.length + b.length);
        for (int i = 0; i < b.length; i++) {
            answer[a.length + i] = b[i];
        }
        return answer;
    }
}