import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int t=0; t<T; t++){
            String str = sc.next();
            sb.append(str);
            if(str.equals(sb.reverse().toString())){
                System.out.println("#" + (t+1) + " 1");
            }else System.out.println("#" + (t+1) + " 0");
            sb.setLength(0);
        }
    }
}