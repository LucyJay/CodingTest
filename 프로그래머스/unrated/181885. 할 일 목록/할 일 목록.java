import java.util.*;
import java.util.stream.*;
class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        IntStream.range(0, todo_list.length).filter(i -> !finished[i]).forEach(i -> list.add(todo_list[i]));
        return list;
    }
}