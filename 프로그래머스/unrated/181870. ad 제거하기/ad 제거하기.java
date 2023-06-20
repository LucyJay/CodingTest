import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        
        return Arrays.asList(strArr).stream().filter(str -> !str.contains("ad")).toArray(String[]::new);
    }
}