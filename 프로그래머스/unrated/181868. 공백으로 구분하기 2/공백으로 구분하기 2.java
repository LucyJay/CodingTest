import java.util.stream.*;
class Solution {
    public String[] solution(String my_string) {
        return Stream.of(my_string.split(" ")).filter(str -> !str.equals("")).toArray(String[]::new);
    }
}