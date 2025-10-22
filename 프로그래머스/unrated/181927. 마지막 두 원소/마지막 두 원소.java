import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] list = new int[len+1];
        list = Arrays.copyOfRange(num_list, 0, len+1);
        list[len] = list[len-2] < list[len-1] ? list[len-1]-list[len-2]: list[len-1]*2;
        return list;
    }
}