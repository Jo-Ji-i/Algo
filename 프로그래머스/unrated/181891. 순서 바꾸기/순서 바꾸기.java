class Solution {
    public int[] solution(int[] num_list, int n) {
        int len =  num_list.length; 
        int[] result = new int[len];
        for(int i=0; i<len; i++){
            if(i<n) result[i+(len-n)] = num_list[i];
            else result[i-n] = num_list[i];
        }
        return result;
    }
}