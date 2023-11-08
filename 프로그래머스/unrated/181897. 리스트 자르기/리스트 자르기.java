import java.util.*;

class Solution {
    List<Integer> list = new ArrayList<>();
    public void slice(int start, int end, int trim, int[] arr) {
            for(int i=start; i<end+1; i+=trim){
                list.add(arr[i]);
            }
        }
    
    public int[] solution(int n, int[] slicer, int[] num_list) {
       
        switch(n){
            case 1: slice(0, slicer[1], 1, num_list); break;
            case 2: slice(slicer[0], num_list.length-1, 1, num_list); break;
            case 3: slice(slicer[0], slicer[1], 1, num_list); break;
            case 4: slice(slicer[0], slicer[1], slicer[2], num_list); break;
        }
        
        return list.stream()
            .mapToInt(i-> i)
            .toArray();
    }
}