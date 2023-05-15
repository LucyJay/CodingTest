import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        switch(set.size()) {
            case 1:
                return 1111 * a;
            case 4:
                int min = a;
                if (min > b) min = b;
                if (min > c) min = c;
                if (min > d) min = d;
                return min;
            case 3:
                if (a == b) return c * d;
                if (a == c) return b * d;
                if (a == d) return b * c;
                if (b == c) return a * d;
                if (b == d) return a * c;
                if (c == d) return a * b;
            case 2:
                int i = 1;
                int ne = 0;
                if (a == b) i++;
                else ne += b;
                if (a == c) i++;
                else ne += c;
                if (a == d) i++;
                else ne += d;
                if (i == 1)
                    return (10 * b + a) * (10 * b + a);
                if (i == 3)
                    return (10 * a + ne) * (10 * a + ne);
                if (i == 2) {
                    ne /= 2;
                    return (a + ne) * ((a - ne >= 0) ? a - ne : ne - a);
                }
        }
        
        return answer;
    }
}