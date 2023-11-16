import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int[] arr = new int[10];
            int check = 0;
            int k = 1;

            while (true){
                int x = n*k;
                String[] s = String.valueOf(x).split("");
                for(int i=0; i<s.length; i++){
                    arr[Integer.parseInt(s[i])]++;
                }
                for(int j=0; j<arr.length; j++){
                    if(arr[j] > 0) check++;
                }
                if(check == 10){
                    break;
                }else{
                    k++;
                    check=0;
                }
            }
            System.out.println("#" + (t+1) + " " + (n*k));
        }
    }
}