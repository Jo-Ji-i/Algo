import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        arr = Arrays.stream(arr).distinct().toArray();
        
        for(int i=0; i<k; i++){
            if(i < arr.length) list.add(arr[i]);
            else list.add(-1);
        }
        
        return list.stream()
            .mapToInt(i-> i)
            .toArray();
    }
}