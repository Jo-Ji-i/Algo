class Solution {
    public int solution(int[] arr, int idx) {
        int result = -1;
        for(int i=idx; i<arr.length; i++){
            if(arr[i] == 1) return i;
        }
        return result;
    }
}