import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int hap = 0;
        for(int t=0; t<T; t++){
            for(int i=0; i<10; i++){
                int x = sc.nextInt();
                hap += x;
            }
            int result = (int)(0.5+(double)hap/10);
            System.out.println("#" + (t+1) + " " + result );
            hap = 0;
        }
    }
}