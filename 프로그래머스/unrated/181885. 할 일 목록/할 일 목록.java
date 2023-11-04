import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> str = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(finished[i] == false) str.add(todo_list[i]); 
        }
        return str.toArray(new String[0]);
    }
}