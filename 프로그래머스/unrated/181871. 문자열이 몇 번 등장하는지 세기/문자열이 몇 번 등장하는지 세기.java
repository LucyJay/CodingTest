class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        while(true) {
            idx = myString.indexOf(pat);
            if (idx != -1) {
                answer++;
                myString = myString.substring(idx + 1, myString.length());
            } else {
                break;
            }
        }
        return answer;
    }
}