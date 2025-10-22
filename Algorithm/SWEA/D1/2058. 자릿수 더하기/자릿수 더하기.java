import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] ch = str.split("");
        int result = 0;


        for(int i=0; i<ch.length; i++){
            result += Integer.parseInt(ch[i]);
        }

        System.out.println(result);
    }
}