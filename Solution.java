package makeTheStringGreat;

//problema 1544
import java.util.Scanner;

public class Solution {

    public static String makeGood(String s) {
        String str = "";
        int size = s.length();

        for (int i = 0; i <= size - 2; i++) {

            boolean cond1 = (int) s.charAt(i) == (int) s.charAt(i + 1) + 32;
            boolean cond2 = (int) s.charAt(i) == (int) s.charAt(i + 1) - 32;
            boolean lastPos = (i == (size - 2));

            if ((cond1 || cond2) && !lastPos) {
                i++;
            } else {
                str += s.charAt(i);
                if (lastPos) {
                    str += s.charAt(i + 1);
                }
            }
        }
        if(!s.equals(str))
            return makeGood(str);
        return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String output = makeGood(input);
        System.out.println(output);
    }
}