class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int num = (code.length() % q > r) ? code.length() / q + 1 : code.length() / q;
        for(int i = 0; i < num; i++ ) {
            answer += code.charAt(i * q + r);
        }
        return answer;
    }
}