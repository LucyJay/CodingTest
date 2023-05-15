class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            if(mode == 0) {
                if(ch == '1')
                    mode = 1;
                else if(idx % 2 == 0) {
                    answer += ch;
                }
            } else {
                if(ch == '1')
                    mode = 0;
                else if (idx % 2 == 1) {
                    answer += ch;
                }
            }
        }
            return (answer.equals("")) ? "EMPTY" : answer;
    }
}