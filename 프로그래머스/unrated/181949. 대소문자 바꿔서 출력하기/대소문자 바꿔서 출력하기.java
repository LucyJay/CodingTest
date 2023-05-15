import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++) {
            char ch = change(a.charAt(i));
            System.out.print(ch);
        }
    }
    public static char change(char ch) {
        int i = 'A' - 'a';
        if('a' <= ch && ch <= 'z')
            return (char)(ch + i);
        else if ('A' <= ch && ch <= 'Z') 
            return (char)(ch - i);
        else return ' ';
        
    }
}