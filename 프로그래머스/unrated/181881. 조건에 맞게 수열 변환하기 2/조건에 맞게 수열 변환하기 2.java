import java.util.*;
class Solution {
    public int solution(int[] arr) {
        boolean end = false;
        int answer = 0;
        loop: while(true) {
            end = true;
            for(int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num >= 50) {
                    if (num % 2 == 0) {
                        arr[i] /= 2;
                        end = false;
                    }
                } else {
                    if (num % 2 != 0) {
                        arr[i] *= 2;
                        arr[i]++;
                        end = false;
                    }
                }
            }
            if (end)
                break loop;
            else
                answer++;
        }
        return answer;
    }
}