class Solution {
    public int[] solution(int n, int k) {
        int[] result = new int[n/k];
        for(int i=1; i<=n/k; i++){
            result[i-1] = k*i;
        }
        return result;
    }
}