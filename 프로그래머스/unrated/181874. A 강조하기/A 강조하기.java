class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer(myString);
        while(sb.indexOf("a") != -1) {
            sb.setCharAt(sb.indexOf("a"), 'A');
        }
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ('B' <= ch && ch <= 'Z') {
                sb.setCharAt(i, (char)(ch + 32));
            }
        }
        return sb.toString();
    }
}