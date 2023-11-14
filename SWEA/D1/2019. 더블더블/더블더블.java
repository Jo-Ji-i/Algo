import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 1;


        for(int i=1; i<=x+1; i++){
            System.out.print(result + " ");
            result = result *2;
        }
    }
}