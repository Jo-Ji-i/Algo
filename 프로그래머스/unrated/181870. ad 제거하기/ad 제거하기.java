import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> str = new ArrayList<>(Arrays.asList(strArr));
        for(int i=0; i<str.size(); i++){
            if(str.get(i).contains("ad")){
                str.remove(i);
                i--;
            }
        }
        return str.toArray(new String[0]);
    }
}