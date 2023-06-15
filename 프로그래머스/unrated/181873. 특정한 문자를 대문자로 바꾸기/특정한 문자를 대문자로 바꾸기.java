class Solution {
    public String solution(String my_string, String alp) {
        my_string = my_string.toLowerCase();
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}