import java.util.Arrays;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] Arr = my_string.toCharArray();
        
        for(char c: overwrite_string.toCharArray()){
            Arr[s++] = c;
        }
        
        return String.valueOf(Arr);
    }
}