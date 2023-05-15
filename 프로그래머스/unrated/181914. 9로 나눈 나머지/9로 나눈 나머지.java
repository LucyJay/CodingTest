class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] ch = number.toCharArray();
        for(char c : ch) {
            answer += c - '0';
        }
        return answer % 9;
    }
}