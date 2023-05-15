import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lux = -1, luy = -1, rdx = -1, rdy = -1;
        List<String> list = Arrays.asList(wallpaper);
        for(int i = 0;  i < list.size(); i++) {
            String w = list.get(i);
            int idx1 = w.indexOf("#");
            int idx2 = w.lastIndexOf("#");
            if (idx1 != -1) {
                System.out.println(""+i+idx1+idx2);
                if(lux == -1)
                    lux = i;
                if(luy == -1 || luy > idx1)
                    luy = idx1;
                if(rdx == -1 || rdx <= i)
                    rdx = i+1;
                if(rdy == -1 || rdy <= idx2)
                    rdy = idx2+1;
            }
            System.out.println(""+lux+luy+rdx+rdy);
            
        }
        return new int[]{lux, luy, rdx, rdy};
    }
}