import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        char ch;

        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a>b ) ch = '>';
            else if (a<b) ch = '<';
            else ch = '=';
            System.out.println("#" + (i+1) +" " + ch) ;
        }
    }
}