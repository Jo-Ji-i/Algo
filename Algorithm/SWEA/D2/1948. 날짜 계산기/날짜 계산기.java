import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] D = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int t=1; t<=T; t++){
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            int total = 0;
            for(int i=m2-1; i>=m1; i--){
                total += D[i];
            }
            total = total + d2 - d1 + 1;
            System.out.println("#" + t + " " + total);
        }
    }
}