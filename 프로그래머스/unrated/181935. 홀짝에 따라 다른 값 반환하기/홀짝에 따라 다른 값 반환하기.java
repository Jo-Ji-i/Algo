class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i=n; i>0; i-=2){
            if(n%2 != 0) result += i;
            else result += Math.pow(i, 2);
        }
        return result;
    }
}