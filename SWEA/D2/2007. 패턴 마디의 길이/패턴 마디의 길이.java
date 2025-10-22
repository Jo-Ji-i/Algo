import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int t=1; t<=T; t++){
            String str = sc.next();
            for(int i=1; i<=10; i++){
                String dv = str.substring(0, i);
                String com = str.substring(i, i+i);
                if(dv.equals(com)){
                    System.out.println("#" + t + " " + i);
                    break;
                }
            }
        }
    }
}