import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] str = a.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length; i++){
            if(Character.isUpperCase(str[i])){
                sb.append(Character.toLowerCase(str[i]));
            }
            else sb.append(Character.toUpperCase(str[i]));
        }

        System.out.println(sb);
        
    }
}