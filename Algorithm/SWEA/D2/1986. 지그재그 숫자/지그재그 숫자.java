import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int total = 0;

        for(int t=0; t<T; t++){
           int n = sc.nextInt();
           for(int i=1; i<=n; i++){
               total = i%2==0? total-i: total+i;
           }
           System.out.println("#" + (t+1) + " " + total);
           total = 0;
        }
    }
}