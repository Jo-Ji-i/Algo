import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){
            int x = sc.nextInt();
            int[] arr = new int[x];
            for(int i=0; i<x; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("#" + t + " ");
            for(int i=0; i<x; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}