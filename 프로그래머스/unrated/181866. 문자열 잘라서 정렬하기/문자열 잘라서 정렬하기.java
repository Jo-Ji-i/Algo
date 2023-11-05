import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        List<String> list = new ArrayList<>(Arrays.asList(str));
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("")){
                list.remove(i);
                i--;
            }
        }
        String[] result = list.toArray(new String[0]);
        Arrays.sort(result, Comparator.naturalOrder());
        return result;
    }
}