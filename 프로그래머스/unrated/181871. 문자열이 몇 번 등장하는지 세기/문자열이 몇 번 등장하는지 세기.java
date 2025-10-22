class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            sb.append(myString.substring(i, i+pat.length()));
            if(pat.equals(sb.toString())) result++;
            sb.setLength(0);
        }
        return result; 
    }
}