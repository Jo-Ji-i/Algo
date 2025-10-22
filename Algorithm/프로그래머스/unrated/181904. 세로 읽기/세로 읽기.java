class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");
        for(int i=c-1; i<my_string.length(); i+=m){
            sb.append(str[i]);
        }
        return sb.toString();
    }
}