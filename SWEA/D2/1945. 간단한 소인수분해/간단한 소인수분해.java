import java.awt.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] numbers = {11, 7, 5, 3, 2};

        for(int t=0; t<T; t++){
            int num = sc.nextInt();
            int[] result = new int[5];
            for(int i=0; i<numbers.length; i++) {
                if(num%numbers[i] == 0){
                    num = num/numbers[i];
                    result[4-i]++;
                    i--;
                }
            }
            System.out.print("#" +(t+1) + " ");
            for(int i=0; i<result.length; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}