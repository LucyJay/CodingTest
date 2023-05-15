class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer mysb = new StringBuffer(my_string);
        for(int[] q : queries) {
            StringBuffer sb = new StringBuffer(mysb.substring(q[0], q[1] + 1));
            sb = sb.reverse();
            mysb = mysb.replace(q[0], q[1]+1, sb.toString());
        }
        return mysb.toString();
    }
}