import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int t=0; t<T; t++){
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] decode = decoder.decode(sc.next());
            System.out.println("#" + (t+1) + ' ' + new String(decode));
        }
    }
}