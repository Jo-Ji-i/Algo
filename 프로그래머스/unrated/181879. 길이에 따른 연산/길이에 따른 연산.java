class Solution {
    public int solution(int[] num_list) {
        int max_len = 11;
        int len = num_list.length;
        int total = (len < max_len ? 1: 0);
        for(int i=0; i<len; i++){
            total = (len < max_len ? total*num_list[i]: total+num_list[i]);
        } 
        return total;
    }
}