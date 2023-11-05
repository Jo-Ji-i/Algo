class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                if(i==j) result[i][j] = 1;
                else result[i][j] = 0;
            }
        }
        return result;
    }
}