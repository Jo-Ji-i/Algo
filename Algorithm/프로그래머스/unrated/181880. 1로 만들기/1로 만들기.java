class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        int temp=0;
        for(int i=0; i<num_list.length; i++){
            temp = num_list[i];
            while(temp != 1){
                result++;
                temp = (temp%2==0? temp/2 : (temp-1)/2);
            }
        }
        return result;
    }
}