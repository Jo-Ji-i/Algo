import java.util.*;

class Solution {
    public int solution(int a, int b) {
        String af = "" + a + b;
        String bf = "" + b + a;
        if(Integer.parseInt(af) < Integer.parseInt(bf)){
            return Integer.parseInt(bf);
        }else return Integer.parseInt(af);
    }
}