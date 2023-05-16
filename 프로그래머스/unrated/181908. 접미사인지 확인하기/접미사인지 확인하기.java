class Solution {
    public int solution(String my_string, String is_suffix) {
        int i = my_string.lastIndexOf(is_suffix);
        int j = my_string.length() - is_suffix.length();
        if (j != -1 && i == j)
            return 1;
        else
            return 0;
    }
}