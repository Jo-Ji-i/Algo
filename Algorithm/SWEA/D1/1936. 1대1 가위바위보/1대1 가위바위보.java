import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        char result;

        if(a>b){
            if(a==3 && b==1) result = 'B';
            else result = 'A';
        }else{
            if(a==1 && b==3) result = 'A';
            else result ='B';
        }

        System.out.println(result);
    }
}