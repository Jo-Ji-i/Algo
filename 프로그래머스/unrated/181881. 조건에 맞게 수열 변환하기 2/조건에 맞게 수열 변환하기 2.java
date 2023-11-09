class Solution {
    public int solution(int[] arr) {
        int check=0;
        int cnt=-1;
        while(check != arr.length){
            check = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i]%2==0) arr[i] = arr[i]/2;
                else if(arr[i] < 50 && arr[i]%2 != 0) arr[i] = arr[i]*2+1; 
                else check++;
            }
            cnt++;
        }
        return cnt;
    }
}