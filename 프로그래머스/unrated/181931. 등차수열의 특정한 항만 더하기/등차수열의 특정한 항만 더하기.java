class Solution {
    public int solution(int a, int d, boolean[] included) {
        int temp = a;
        int result = 0;
        for(int i=0; i<included.length; i++){
            if(included[i] == true) result += temp+i*d;
        }
        return result;
    }
}