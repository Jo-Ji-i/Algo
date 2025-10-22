import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("a|b|c");
        List<String> list = new ArrayList(Arrays.asList(str));
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("")){
                list.remove(i);
                i--;
            }
        }
        if(list.isEmpty()) list.add("EMPTY");
        return list.toArray(new String[0]);
    }
}