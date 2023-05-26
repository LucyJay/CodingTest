import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        List<Integer> list = new ArrayList<>();
        switch(n) {
            case 1 :
                for (int i = 0; i <= b; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2 :
                for (int i = a; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3 :
                for (int i = a; i <= b; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4 :
                for (int i = a; i <= b; i += c) {
                    list.add(num_list[i]);
                }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}