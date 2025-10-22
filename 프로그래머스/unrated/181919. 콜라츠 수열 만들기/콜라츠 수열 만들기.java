import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while(n != 1){
            list.add(n);
            n = (n%2 == 0? n/2: n*3+1);
        }
        list.add(1);
        return list.stream()
			.mapToInt(i -> i)
            .toArray();
    }
}