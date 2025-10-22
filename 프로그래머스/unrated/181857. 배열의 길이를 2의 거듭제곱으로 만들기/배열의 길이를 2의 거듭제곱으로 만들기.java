import java.util.*;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] pow = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int poww = 0;
        
        for(int i=0; i<pow.length; i++){
            if(arr.length <= pow[i]){
                poww = pow[i];
                break;
            }
        }
        
        for(int i=0; i<poww; i++){
            if(i > arr.length-1){
                list.add(0);
            }else{
                list.add(arr[i]);
            }
        }
        
        return list.stream()
            .mapToInt(i->i)
            .toArray();
    }
}