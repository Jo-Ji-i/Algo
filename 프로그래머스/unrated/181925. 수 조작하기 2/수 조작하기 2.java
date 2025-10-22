class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder(); 
        int temp = 0;
        for(int i=1; i<numLog.length; i++){
            temp = numLog[i]-numLog[i-1];
            if(temp == 1) sb.append("w");
            else if(temp == -1) sb.append("s");
            else if(temp == 10) sb.append("d");
            else sb.append("a");
        }
        return sb.toString();
    }
}