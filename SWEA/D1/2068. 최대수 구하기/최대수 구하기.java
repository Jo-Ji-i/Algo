import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int max = -1;

        for(int i=0; i<T; i++){
            for(int j=0; j<10; j++){
                int x = sc.nextInt();
                if(x > max) max = x;
            }
            System.out.println("#" + (i+1) +" " + max);
            max = -1;
        }

    }
}