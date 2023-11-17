import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++){
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            int A = W*P;
            int B = (W < R? Q : (W-R)*S + Q);
            if(A < B) System.out.println("#" + (t+1) + " " + A);
            else  System.out.println("#" + (t+1) + " " + B);
        }
    }
}