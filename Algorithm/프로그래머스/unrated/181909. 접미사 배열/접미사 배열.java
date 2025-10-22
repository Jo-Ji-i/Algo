import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.substring(i));
        }
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);
        return arr;
    }
}