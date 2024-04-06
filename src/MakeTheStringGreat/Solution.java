package MakeTheStringGreat;
//problema 1544
import java.util.Scanner;

public class Solution {
    public static String makeGood(String s) {
        String str = "";
        for(int i=0; i<=s.length()-2; i++){
            if( ((int)s.charAt(i)) != ((int)s.charAt(i+1)+32) ){
                str += s.charAt(i);
            }else{
                i++;
            }
        }
        return str;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String output = makeGood(input);
        System.out.println(output);
    }
}
