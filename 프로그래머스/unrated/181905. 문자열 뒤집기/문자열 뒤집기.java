class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer str = new StringBuffer(my_string.substring(s, e + 1));
        System.out.println(str.reverse());
        return my_string.substring(0, s) + str + my_string.substring(e + 1);
    }
}